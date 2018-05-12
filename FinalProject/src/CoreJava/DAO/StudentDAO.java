/*
@author=Jacob Duchen
 */

package CoreJava.DAO;
import CoreJava.Models.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//StudentDAO provides all functionality of signing in, signing up, and validating that information

public class StudentDAO {
    String filePath = "src/database/Students.csv";
    //this boolean will be used in a later method to check if a user/password combination is valid in method validateUser
    boolean validated = false;

//fetch an updated list of students from csv file
    public List<Student> getStudents() {
        File file = new File(filePath);
        //create an arraylist to shovel data into
        ArrayList<Student> data = new ArrayList<Student>();

        try {
            //create reader
            Scanner read = new Scanner(file);
            //while file line is not empty
            while (read.hasNextLine()) {

                //store the line in a String array.
                String line[] = read.nextLine().split(",");

                // storing the data from that String array in a Student object.
                data.add(new Student(line[0], line[1], line[2]));
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error occurred while we attempted to read Students.csv");
        }

        //return Student list to user
        return data;
    }

//fetch an individual student object
    public Student getStudentByEmail(List<Student> studentList, String studentEmail) {
        //creating blank student object
        Student studentDetails = new Student();
//for all students in studentlist
        for (Student student : studentList) {
            //check if student email matches our desired target
            if (student.getEmail().equals(studentEmail.toLowerCase())) {
                studentDetails = new Student(student.getEmail(), student.getName(), student.getPass());
            }
        }
//return that student object
        return studentDetails;
    }

    //make sure a real student is trying to sign in
    public boolean validateUser(List<Student> studentList, String studentEmail, String studentPass) {
//for every student in studentlist
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
//we want to check if our student has an email that matches email in DB, and our password matches that student.password
            if ((student.getEmail().trim().equals((studentEmail.trim()))) && (student.getPass().trim().equals((studentPass.trim())))) {
                validated = true;
            }


        }
//        System.out.println(validated);
        return validated;
    }

//method to registerstudent to DB
        public void registerStudent (List < Student > studentList, String studentEmail, String studentName, String studentPass){
        //boolean to start that student is not in DB
            boolean isStudentInDb = false;

//if student is not in DB we dont want to readd them
            for (Student student : studentList) {
                if (student.getEmail().equals(studentEmail)) {
                    isStudentInDb = true;
                }
            }
//if student is not in DB
            if (isStudentInDb == false) {
                //create a new student and assign its properties
                Student obj = new Student();
                obj.setEmail(studentEmail);
                obj.setName(studentName);
                obj.setPass(studentPass);
                studentList.add(obj);

                try {
                    //bringing in filewriter
                    FileWriter writer = new FileWriter(filePath); //Overwrite is true

                    //Clearing data
                    writer.write("");
                    writer.close();

                    //bringing in instance of filewriter
                    writer = new FileWriter(filePath);

                    //Writing to file in CSV format line by line using a for loop
                    for (Student data : studentList) {
                        writer.write(data.getEmail() + "," + data.getName() + ", " + data.getPass() + "\r\n");
                    }

                    //Close file after writing
                    writer.close();

                } catch (IOException e) {
                    System.out.println("Error attempting to write Students.csv");
                }
            }
    }
}
