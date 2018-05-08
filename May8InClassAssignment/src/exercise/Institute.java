package exercise;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Institute {

    public static void main(String[] args) {
        Student Jacob = new Student("Jacob", "CS");
        Student Aaron = new Student("Aaron", "CS");
        Student Brian = new Student("Brian", "CS");
        Student Dylan = new Student("Dylan", "Nursing");
        Student Alice = new Student("Alice", "Biology");

        Student[] studentArray = {Jacob, Dylan, Aaron, Brian, Alice};

        List<Student> cs_students = new ArrayList<>();

        for(int i = 0; i < studentArray.length; i++) {
            if (studentArray[i].getDept() == "CS") {
                cs_students.add(studentArray[i]);
            }
        }

        Department CS = new Department("CS", cs_students);
        System.out.println(CS.getAmountOfDeptStudents() + " students in the CS dept!");

        CS.printStudentsInDept();



    }
}
