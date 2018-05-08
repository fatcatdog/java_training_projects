/*
@author Jacob Duchen
*/

package files;

public class Student {
String name;
int grade;
float gpa;

//constructor
    public Student() {
        this.name = "JohnDoe";
        this.grade = 0;
        this.gpa = 0.0f;
    }
//constructor
    public Student(String name, int grade, float gpa){
        this.name = name;
        this.grade = grade;
        this.gpa = gpa;
    }


//getter
    public String getName(){
        return (this.name);
    }
//setter
    public void setName(String name){
        this.name = name;
    }
//getter
    public String getGrade(){
        return Integer.toString(this.grade);
    }
//setter
    public void setGrade(int grade){
        this.grade = grade;
    }
//getter
    public String getGpa(){
        return Float.toString(this.gpa);
    }
//setter
    public void setGpa(float gpa){
        this.gpa = gpa;
    }
//getter for all info in a formatted string as desired
    public String getInfo(){
//        System.out.println("My name is " + this.first_name + " " +  this.last_name + ". I'm in grade " + Integer.toString(this.grade) + " and I have a " + Float.toString(this.gpa) + " GPA. For now, at least...\n");
        return ("My name is " + this.name + ". I'm in grade " + Integer.toString(this.grade) + " and I have a " + Float.toString(this.gpa) + " GPA. For now, at least...\n");
    }
//getting more compact print out of string
    public String getCompactInfo(){
        return (this.name + ", " + Integer.toString(this.grade) + ", " + Float.toString(this.gpa) + ", ");
    }

}
