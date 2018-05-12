/*
@author = Jacob Duchen
*/

package AssignmentTwo;

public class Trainee extends Employee {
    //declaring variables
    long id;
    String name;
    String address;
    long phone;
    double basicSalary;
    double specialAllowance;
    double hra;
//creating trainee constuructor with super/new employee
    public Trainee(long id, String name, String address, long phone, double basicSalary) {
        super(id, name, address, phone, basicSalary);
    }
//creating trainee constuructor with super/new employee
    public Trainee(long id, String name, String address, long phone, double basicSalary, double specialAllowance, double hra) {
        super(id, name, address, phone, basicSalary, specialAllowance, hra);
    }

}
