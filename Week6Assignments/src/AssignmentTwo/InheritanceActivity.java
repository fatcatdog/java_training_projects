/*
@author = Jacob Duchen
*/

package AssignmentTwo;

public class InheritanceActivity extends Employee {

    public static void main(String[] args) {
        Manager ted = new Manager(126534, "Ted", "Chennai India", 237844, 65000);
        System.out.println("Manager");
        ted.calculateSalary();
        ted.calculateTransportAllowance();
        System.out.println("Trainee");
        Trainee bob = new Trainee(234455, "bob", "Las Vegas India", 12345, 35432);
        bob.calculateSalary();
        bob.calculateTransportAllowance();
    }
}
