/*
@author=Jacob Duchen
 */

package CoreJava.Models;

//course constructor class
//getters and setters here as variables are private
public class Course {
    private String id;
    private String name;
    private String instructor;

    //dummy data for when we first create a course, which we never use but could use, constructor
    public Course(){
        this.id = "0000";
        this.name = "None";
        this.instructor = "John Doe";
    }

    public Course(String courseID, String courseName, String instructor){
        this.id = courseID;
        this.name = courseName;
        this.instructor = instructor;
    }

    public void setID(int ID){

        this.id = Integer.toString(ID);
    }

    public int getID(){

        return Integer.parseInt(this.id);
    }

    public void setName(String name){

        this.name = name;
    }

    public String getName(){

        return this.name;
    }

    public void setInstructor(String instructor){

        this.instructor = instructor;
    }

    public String getInstructor(){

        return this.instructor;
    }
}
