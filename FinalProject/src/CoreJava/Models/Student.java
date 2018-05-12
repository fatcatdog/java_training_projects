/*
@author=Jacob Duchen
 */

package CoreJava.Models;
//student constructor class
//getters and setters here as variables are private
public class Student {
    private String email;
    private String name;
    private String pass;

//when we first create a student, variables are blank
    public Student(){
        this.email = "";
        this.name = "";
        this.pass = "";
    }

    public Student(String email, String name, String pass){
        this.email = email;
        this.name = name;
        this.pass = pass;
    }

    public void setEmail(String email){

        this.email = email;
    }

    public String getEmail(){

        return this.email;
    }

    public void setName(String name){

        this.name = name;
    }

    public String getName(){

        return this.name;
    }

    public void setPass(String pass){

        this.pass = pass;
    }

    public String getPass(){

        return pass;
    }

}
