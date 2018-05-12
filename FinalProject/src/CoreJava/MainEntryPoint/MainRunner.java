/*
@author=Jacob Duchen
 */

package CoreJava.MainEntryPoint;

import CoreJava.DAO.AttendingDAO;
import CoreJava.DAO.CourseDAO;
import CoreJava.DAO.StudentDAO;
import CoreJava.Models.Attending;
import CoreJava.Models.Course;
import CoreJava.Models.Student;

import java.util.List;
import java.util.Scanner;

//this was provided with final project to assist testing/our models and constructors

public class MainRunner {
    public static void main(String[] args) {
        System.out.println("Are you a(n)");
        System.out.println("1. Student");
        System.out.println("2. Quit");
        System.out.print("Answer: ");
        Scanner in = new Scanner(System.in);
        int answer = in.nextInt();
        if(answer == 1){
            StudentDAO studentDAO = new StudentDAO();
            List<Student> studentList = studentDAO.getStudents();
            System.out.print("Enter your email: ");
            String email = in.next();
            System.out.print("Enter your password: ");
            String password = in.next();

            if(studentDAO.validateUser(studentList, email, password)){
                CourseDAO courseDAO = new CourseDAO();
                AttendingDAO attendingDAO = new AttendingDAO();
                Student student = studentDAO.getStudentByEmail(studentList, email);
                List<Course> courseList = courseDAO.getAllCourses();
                List<Attending> attendingList = attendingDAO.getAttending();

                myClasses(student, courseList, attendingList);

                System.out.println("What would you like to do?");
                System.out.println("1. Register for a new Class");
                System.out.println("2. Log Out");
                System.out.print("Answer: ");
                answer = in.nextInt();

                if(answer == 1){
                    while(answer == 1) {
                        //Display a list of all Classes
                        allClasses(courseList);
                        System.out.print("Select Course by ID Number: ");
                        int courseID = in.nextInt();
                        System.out.println("Attempting to Register...");
                        attendingDAO.registerStudentToCourse(attendingList, student.getEmail(), courseID);
                        System.out.println("Successful Registration");
                        System.out.println("Do you want to register another course or sign out?");
                        System.out.println("1. to register, 2. to exit");
                        answer = in.nextInt();
                    }
                }

                System.out.println("Logging Out...");
            }
            else {
                System.out.println("Invalid Email or Password.");
            }
        }

        System.out.println("Closing Program. Goodbye.");
    }

    public static void myClasses(Student student, List<Course> courseList, List<Attending> attendingList){
        System.out.println("My Classes: ");
        AttendingDAO attendingDAO = new AttendingDAO();
        List<Course> courses = attendingDAO.getStudentCourses(courseList, attendingList, student.getEmail());
        for(Course course : courses){
            System.out.println("Course ID: " +course.getID() + " Course Name: " + course.getName() + " Course Teacher: " + course.getInstructor());
        }
    }

    public static void allClasses(List<Course> courseList){
        System.out.println("All Classes: ");
        for(Course course : courseList){
            System.out.println("Course ID: " +course.getID() + " Course Name: " + course.getName() + " Course Teacher: " + course.getInstructor());
        }
    }
}
