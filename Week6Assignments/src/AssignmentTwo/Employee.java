/*
@author = Jacob Duchen
*/

package AssignmentTwo;
import java.text.DecimalFormat;

public class Employee {
//declaring variables
long id;
String name;
String address;
long phone;
double basicSalary;
double specialAllowance;
double hra;
//creating employee constructor
    public Employee(long id, String name, String address, long phone, double basicSalary, double specialAllowance, double hra) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.basicSalary = basicSalary;
        this.specialAllowance = specialAllowance;
        this.hra = hra;
    }
//creating employee constructor

    public Employee(long id, String name, String address, long phone, double basicSalary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.basicSalary = basicSalary;
        this.specialAllowance = 250.80;
        this.hra =  1000.50;
    }
//creating employee constructor

    public Employee(long id, String name, String address, long phone){
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
//creating employee constructor

    public Employee(){
        this.specialAllowance = 250.80;
        this.hra =  1000.50;
    }
//presenting salary in readable format
    private static DecimalFormat df2 = new DecimalFormat(".##");

    //method to calculate real salary (bonus + allowance + salary etc.)
    //using decimal formal to make it presentable
    public void calculateSalary() {
        double salary =  this.basicSalary + ( this.basicSalary * this.specialAllowance/100) + ( this.basicSalary * this.hra/100);
        System.out.println(df2.format(salary));
    }
    //using decimal formal to make it presentable

    public void calculateTransportAllowance() {
        double transportAllowance = ((10 /100.0) * this.basicSalary);
        System.out.println(df2.format(transportAllowance));
    }



}


