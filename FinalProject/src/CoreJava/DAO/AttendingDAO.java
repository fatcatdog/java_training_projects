/*
@author=Jacob Duchen
 */
//bringing in our custom packages and java packages
package CoreJava.DAO;

import CoreJava.Models.Attending;
import CoreJava.Models.Course;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//attendingDAO provides most of the methods and logic to registering students to courses, and producing that information for users
public class AttendingDAO {
//filepath to be used by reader and writer
    final String filePath = "src/database/Attending.csv";


//first get all students currently registered "attending" classes in our csv
    public List<Attending> getAttending(){
        File file = new File(filePath);
//creating an ArrayList that we will read and store information to
        ArrayList<Attending> studentsAndTheirCourseCodes = new ArrayList<Attending>();
//try read each line to write to our ArrayList
        try {
            Scanner read = new Scanner(file);

            while(read.hasNextLine()) {

                //storing each line as a String
                String line[] = read.nextLine().split(",");

                //actually adding that String data to our ArrayList
                studentsAndTheirCourseCodes.add(new Attending((line[0]), line[1]));
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error reading Attending.csv");
        }
//return our arraylist of currently attending students with their corresponding course codes
        return studentsAndTheirCourseCodes;
    }

//add a student - course code to attending array
    public void registerStudentToCourse(List<Attending> attending, String studentEmail, int courseID){
        //initially we assume student is not in attending
        boolean isAttending = false;
//if student is already registered in attending, we dont want to try reregister them again (so we would set this to true in this for loop)
        for(Attending list : attending) {
            if(list.getStudentEmail().equals(studentEmail) && list.getCourseID() == courseID) {
                isAttending = true;
            }
        }

        //If the Student is not attending that Course, add a new Attending object with the Student's Email and Course ID to the List Attending.csv.
        if(!isAttending) {
            attending.add(new Attending(String.valueOf(courseID), studentEmail));
            this.saveAttending(attending);
        }
    }

//here we are going to produce a students ArrayList of current courses attending
    public List<Course> getStudentCourses(List<Course> courseList, List<Attending> attending, String studentEmail){
        ArrayList<Course> data = new ArrayList<Course>();

        //start by looping at looking at current attending list
        for(Attending listAttending : attending) {
            //if student email matches our student
            if(listAttending.getStudentEmail().equals(studentEmail)) {
                //we will store all of this information in this loop
                for(Course listCourse : courseList) {
                    if(listAttending.getCourseID() == listCourse.getID()) {
                        data.add(new Course(String.valueOf(listCourse.getID()), listCourse.getName(), listCourse.getInstructor()));
                    }
                }
            }
        }
        //return this information of relevant student courses
        return data;
    }

    //saving current attending list
    public void saveAttending(List<Attending> attending){
        try {
            //bringing in file writer
            FileWriter writer = new FileWriter(filePath); //Overwrite is true

            //starting with a fresh plate
            writer.write("");
            writer.close();

            writer = new FileWriter(filePath);

            //writing each member of attending list to csv in appropriate format
            for(Attending data : attending) {
                writer.write(data.getCourseID() + "," + data.getStudentEmail() + "\r\n");
            }

            //close the writer
            writer.close();

        } catch (IOException e) {
            System.out.println("Error while attempting to write to Attending.csv");
        }
    }

}
