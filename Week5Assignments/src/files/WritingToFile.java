/*
@author Jacob Duchen
*/

package files;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WritingToFile {



    public static void main(String[] args) throws FileNotFoundException {
        ////we started with objects we manually create, but dont use that in last exercise


//        Student student101 = new Student("Jacob", "Duchen", 14, 3.23f);
//        Student student102 = new Student("Eric", "F", 17, 2.23f);
//        Student student103 = new Student("Dylan", "Duchen", 12, 5.23f);
//        Student student104 = new Student("Charles", "Dickens", 16, 1.23f);
//        Student[] students = {student101, student102, student103, student104};


        ////writing our files with our objects we created

//        for(int i = 0; i < students.length; i++) {
//            try {
//                FileWriter namesWriter = new FileWriter("/Users/jacobduchen/desktop/students.csv", true);
//                namesWriter.write(students[i].getCompactInfo());
//                namesWriter.write(students[i].getInfo());
//                namesWriter.write(students[i].getName() + "\n");
//                namesWriter.close();

//                FileWriter gradesWriter = new FileWriter("/Users/jacobduchen/desktop/grades.txt", true);
//                gradesWriter.write(students[i].getCompactInfo());
////                gradesWriter.write(students[i].getInfo());
////                gradesWriter.write(students[i].getGrade() + "\n");
//                gradesWriter.close();
//
//                FileWriter gpaWriter = new FileWriter("/Users/jacobduchen/desktop/gpas.txt", true);
//                gpaWriter.write(students[i].getCompactInfo());
////                gpaWriter.write(students[i].getInfo());
////                gpaWriter.write(students[i].getGpa() + "\n");
//                gpaWriter.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }


        System.out.println("Reading Students csv\n");
        //parsing through text file with next line, which eats up white space as well i think?
        Scanner scanner = new Scanner(new File("/Users/jacobduchen/desktop/students.csv"));
        String everything = "";
        while(scanner.hasNext()){
             everything += (scanner.next()+"");
        }
        scanner.close();
//splitting string at ,'s to create an array of words / numbers
        String[] arrayStrings = everything.split(",");

        //we have to know when to iterate through file, we know that each student has 3 properties, so we iterate this many times
        int amountOfStudents = arrayStrings.length / 3;
//creating array of students to fill in with data
        Student[] students = new Student[amountOfStudents];
        //counter to add a varying number depending on where we are in the loop
        int counter;
//looping through array to write each student object with correct data
        for(int i = 0; i < amountOfStudents; i++) {
            counter = (i * 3) - i;
            students[i] = new Student();
            students[i].setName(arrayStrings[i + counter]);
            students[i].setGrade(Integer.parseInt(arrayStrings[i + counter + 1]));
            students[i].setGpa(Float.parseFloat(arrayStrings[i + counter + 2]));
        }
//printing out our new objects to make sure it works
        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i].getInfo());
        }
    }
}
