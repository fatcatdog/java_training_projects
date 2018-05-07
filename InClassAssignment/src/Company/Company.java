package Company;

import java.util.Arrays;

public class Company {
    String ceo;
    String[] employees;
    double money;
    Customer[] customers;


public Company(String ceo, String[] employees, double money, Customer[] customers) {
    this.ceo = ceo;
    this.employees = employees;
    this.money = money;
    this.customers = customers;
}

 void printDetails() {
    System.out.println(this.ceo);
    System.out.println(String.format( "%.2f", this.money));
    System.out.println(Arrays.toString(this.employees));
    System.out.println(Arrays.toString(this.customers));

}

void printCustomerInfo(){
    Customer[] ourCustomers = this.customers;

    for(int i = 0; i < ourCustomers.length; i++) {
        System.out.println(this.customers[i].name);
        System.out.println(this.customers[i].fees);
        System.out.println(this.customers[i].industry);
    }
}

    public static void main(String[] args) {
    String[] employees = {"John", "Jingle Humer", "Smith"};
    String[] contacts = {"Jacob", "Dylan", "Alice"};

    Customer Nike = new Customer("Nike", 234556.82, 345678.0, "Professsional Sports", contacts);
    Customer Adidas = new Customer("Adidas", 234556.82, 345678.0, "Professsional Sports", contacts);
    Customer Exxon = new Customer("Exxon", 234556.82, 345678.0, "Professsional Sports", contacts);

    Customer[] customers = {Nike, Adidas, Exxon};

    Company Facebook = new Company("Mark Zuckerberg", employees, 8000000000.76, customers);

    Facebook.printDetails();
    Facebook.printCustomerInfo();

    }

}
