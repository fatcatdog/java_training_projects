/*
@author = Jacob Duchen
*/

package AssignmentTwo;

public class Manager extends Employee {
//declaring variables
    long id;
    String name;
    String address;
    long phone;
    double basicSalary;
    double specialAllowance;
    double hra;
//creating a manager using employee super/new employee
    public Manager(long id, String name, String address, long phone, double basicSalary, double specialAllowance, double hra) {
       super(id, name, address, phone, basicSalary, specialAllowance, hra);
    }
    //creating a manager using employee super/new employee
    public Manager(long id, String name, String address, long phone, double basicSalary) {
        super(id, name, address, phone, basicSalary);
    }


}
