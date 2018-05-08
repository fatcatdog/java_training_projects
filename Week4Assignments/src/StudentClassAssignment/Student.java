/*
@author Jacob Duchen
*/

package StudentClassAssignment;
import java.util.Scanner;


public class Student {
    //declaring variables for student class
     String firstName;
     String lastName;
     int[] grades;
     float gpa;
     Course course;


//Student automatically enrolled in a dummy data course
    Course dummy = new Course("NaN", "NaN", "NaN");
//dummy data constructors
    int[] sampleGrades = {0};

     //student constructor
    public Student(String firstName, String lastName, int[] grades, float gpa, Course c) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
        this.gpa = gpa;
        this.course = c;
    }

    //get info method to print student

    void printDetails(){
        System.out.print("Student: " + firstName + " " + lastName);
        System.out.print("\nCourses enrolled in: " + course.className);
        System.out.print("\nGrades: ");
        for(int i = 0; i < grades.length; i++) {
            System.out.print(grades[i] + " ");
        }
        System.out.println("\nGPA: " + gpa);
    }

    //exercise 5 info printed out
    public void getInfo() {
        System.out.print("My name is " + firstName + " " + lastName + ". My grades are ");
        for(int i = 0; i < grades.length; i++) {
            System.out.print(grades[i] + ", ");
        }
        System.out.println("and my GPA is " + gpa + ".");
    }
//adding a specific course, we have three available courses declared in main, integer returned will determine which course is chosen
    public static int addCourse(String courseAnswer){
        if (courseAnswer == "CS135") {
            return 0;
        } else if (courseAnswer == "CS145") {
           return 1;
        } else {
            return 2;
        }
    }
//exercise 5's printing method
    public void getCourse() {
        System.out.println("I'm taking " + course.courseCode + " " + course.className + " by " + course.professor);
    }

    public static void main(String[] args) {
        //these variables will enable getting gpa avg
       float total = 0;
       float gpaAvg;
       int chosenCourse;
//creating our classes
        Course CS135 = new Course("CS135", "Intro to Object Oriented Programming", "Joseph");
        Course CS145 = new Course("CS145", "Intro to Algorithm Design", "Stevens");
        Course CS235 = new Course("CS235", "Object Oriented Programming II", "Robin");
        //saving them to an array
        Course[] courseList = {CS135, CS145, CS235};


//bringing in scanner called userinput
       Scanner userInput = new Scanner(System.in);

       System.out.println("How many students do you have that you want to input?");
//numstudents will allow looping right amount of times
       int numStudents = userInput.nextInt();
//creating array of students
        Student[] listOfStudents = new Student[numStudents];
//through this loop, user will input student info
        for(int i = 0; i < numStudents; i++){
            System.out.println("Student first name?");
            String first_name = userInput.next();
            System.out.println("Student last name?");
            String last_name = userInput.next();
            System.out.println("How many grades does student have?");
            int amount_of_grades = userInput.nextInt();
//inputting grades will require creating an array
            int[] grades = new int[amount_of_grades];
//inputting grades into grades array
            for(int j = 0; j < amount_of_grades; j++){
                System.out.println("Please input a grade: ");
                grades[j] = userInput.nextInt();
            }
//getting gpa of students
            System.out.println("Student GPA as a float(i.e. 3.45 or 4.00)?");
            float gpa_from_input = userInput.nextFloat();
//getting user to choose what classes they are taking
            System.out.println("1) CS135 | Intro to Object Oriented Programming | Joseph\n" +
                    "2) CS145 | Intro to Algorithm Design | Stevens\n" +
                    "3) CS235 | Object Oriented Programming II | Robin");
            System.out.println("Which courses are you taking? CS135, CS145, or CS235?");
//user inputs a string courseAnswer
            String courseAnswer = userInput.next();
//we turn the inputted string to an integer
            chosenCourse = addCourse(courseAnswer);
//that integer will select the class from array of courses
            listOfStudents[i] = new Student(first_name, last_name, grades, gpa_from_input, courseList[chosenCourse]);
        }
//printing our student stats

        for(int i = 0; i < numStudents; i++) {
            listOfStudents[i].printDetails();
        }
//printing our student info as asked by assignment

        for(int i = 0; i < numStudents; i++) {
            listOfStudents[i].getInfo();
            listOfStudents[i].getCourse();
        }
//adding up our gpas so we can get a total gpa that we can divide

        for(int i = 0; i < listOfStudents.length; i++) {
            total += listOfStudents[i].gpa;
        }
//presenting our GPA average
        gpaAvg = total/listOfStudents.length;
        System.out.println("Gap avg: " + String.format("%.02f", gpaAvg));

    }
}
