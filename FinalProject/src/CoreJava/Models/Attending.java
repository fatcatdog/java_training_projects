/*
@author=Jacob Duchen
 */

package CoreJava.Models;
//attending constructor class
//getters and setters here as variables are private

public class Attending {
    private String id;
    private String studentEmail;

    //dummy attending object constructor
    public Attending() {
        this.id = "0000";
        this.studentEmail = "mark@facebook.com";
    }

    public Attending(String courseID, String studentEmail) {
        this.id = courseID;
        this.studentEmail = studentEmail;
    }

    public void setCourseID(int courseID){
        this.id = Integer.toString(courseID);
    }

    public int getCourseID(){

        return Integer.parseInt(this.id);
    }

    public void setStudentEmail(String studentEmail){

        this.studentEmail = studentEmail;
    }

    public String getStudentEmail(){

        return this.studentEmail;
    }
}
