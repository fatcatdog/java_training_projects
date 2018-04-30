/**
In class ScannerLaptopDemo.java exercise
 @author = Jacob duchen
*/

import java.util.Scanner;

public class ScannerLaptopDemo {

    public static void main(String[] args) {
        Integer num1;
        Integer num2;

        System.out.println("Add-1\n" +
                "Subtract-2\n" +
                "Multiply-3\n" +
                "Quit-4");

        Scanner userInput = new Scanner(System.in);

        //variable choice will default to 4 if user puts in a non-integer
        Integer choice;

        if (userInput.hasNextInt()) {
            choice = userInput.nextInt();
        } else {
            choice = 4;
        }
        //program will use choice in this switch statement to navigate between + - * functions
        switch (choice) {
            case 1:
                System.out.println("Enter two numbers to be added");
                System.out.println("Enter your first number: ");
                num1 = userInput.nextInt();
                System.out.println("Enter your second number: ");
                num2 = userInput.nextInt();
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case 2:
                System.out.println("Enter two numbers to be subtracted");
                System.out.println("Enter your first number: ");
                num1 = userInput.nextInt();
                System.out.println("Enter your second number: ");
                num2 = userInput.nextInt();
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;

            case 3:
                System.out.println("Enter two numbers to be multiplied");
                System.out.println("Enter your first number: ");
                num1 = userInput.nextInt();
                System.out.println("Enter your second number: ");
                num2 = userInput.nextInt();
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            default:
                System.out.println("You have been terminated");
                break;
        }

    }
}
