package exercise;

import java.util.List;

public class Department {
    List<Student> students;
    String name;

    public Department (String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

    public String getDeptName(){
        return this.name;
    }

    public int getAmountOfDeptStudents(){
        return this.students.size();
    }

    public void printStudentsInDept() {
        for (int i = 0; i < this.students.size(); i++) {
            System.out.println(this.students.get(i).getName());
        }
    }

}
