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

public class TestRunner {
    //here is where we run the program
    public static void main(String[] args) {
        System.out.println("Are you a(n)");
        System.out.println("1. Sign In As Student");
        System.out.println("2. Sign Up As Student");
        System.out.println("3. Terminate Program");
        System.out.print("Answer: ");
        Scanner scannerInput = new Scanner(System.in);
        int answer = scannerInput.nextInt();
        int counter = 0;
        String email;
        String password;

        while(answer < 4) {
            if (counter == 3) {
                System.out.println("Sorry you didnt have the right password. Program terminated");
                return;
            }


            if (answer == 1) {
                System.out.println("1. Sign In As Student");
                StudentDAO studentDAO = new StudentDAO();
                List<Student> studentList = studentDAO.getStudents();
                System.out.print("Enter your email: ");
                email = scannerInput.next();
                System.out.print("Enter your password: ");
                password = scannerInput.next();

                if (studentDAO.validateUser(studentDAO.getStudents(), email, password)) {
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
                    answer = scannerInput.nextInt();

                    if (answer == 1) {
                        while (answer == 1) {
                            //Display a list of all Classes
                            allClasses(courseList);
                            System.out.print("Select Course by ID Number: ");
                            int courseID = scannerInput.nextInt();
                            System.out.println("Attempting to Register...");
                            attendingDAO.registerStudentToCourse(attendingList, student.getEmail(), courseID);
                            System.out.println("Successful Registration");
                            System.out.println("Do you want to register another course or sign out?");
                            System.out.println("1. to register, 2. to exit");
                            answer = scannerInput.nextInt();
                        }
                    }

                    System.out.println("Logging Out...");
                    answer = 5;
                } else {
                    System.out.println("Invalid Email or Password.");
                    System.out.println("You have " + (2 - counter) + " tries left.");
                    counter++;
                }
            } else if (answer == 2) {
                System.out.println("Lets sign you up");
                System.out.println("What is your name?");
                String newName = scannerInput.next();
                System.out.println("What is your student email?");
                String newEmail = scannerInput.next();
                System.out.println("Create a password?");
                String newPassword = scannerInput.next();


                StudentDAO studentDAO = new StudentDAO();
                List<Student> studentList = studentDAO.getStudents();

                if (!studentDAO.validateUser(studentList, newEmail, newPassword)) {
                    studentDAO.registerStudent(studentList, newEmail, newName, newPassword);
                    answer = 1;
                } else {
                    System.out.println("Already registered in student database");
                }
            } else {
                System.out.println("Closing Program. Goodbye.");
                return;
            }
        }
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
