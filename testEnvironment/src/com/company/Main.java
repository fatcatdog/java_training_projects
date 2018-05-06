package com.company;

//importing scanner package
import java.util.Scanner;
import java.lang.Math;

/*
@author jacob duchen
*/

//class name
public class Main {

//standard main function from boilerplate
    public static void main(String[] args) {



        //bringing in scanner
//        Scanner userInput = new Scanner(System.in);
//
////declaring variables
//        int number;
//        int n;
//        //and assigning this one
//        int total = 0;
//
//        //user determines how many loops we will run being n
//        System.out.println("How many numbers do you want to input?");
//
//        n = userInput.nextInt();
//
////here is our for loop, ever iteration, user will input a number and we will add it to the total. at n, we will simpy exit and show total on the last println of the program outside of the loop
//        for(int i = 0; i < n; i++) {
//            System.out.println("Please input a number");
//            number = userInput.nextInt();
//            total = total + number;
//        }
////casting to an integer
//        System.out.println("The average of those numbers is " + (int)(total / (n * 1.0)));

//        double num = 4.0;
//        num++;
//        System.out.println((float)(num));





        double thing = Math.random();
        System.out.println(thing * 100);


    }
}


////declaring variables
//        double amount;
//        double tax;
//        double tip;
////bringing in scanner
//        System.out.println("what is the amount?");
//
//        //user input is a dobule
//        amount = userInput.nextDouble();
//
//        System.out.println("What is the tax rate? (ex. 6 for 6%)");
//        //tax is a double
//        tax = userInput.nextDouble();
//
//
//        System.out.println("What is the tip? (for example 20 being 20%");
//
//        //tip is a double
//        tip = userInput.nextDouble();
//
//        //manipulating doubles into reading strings to 2 decimal places
//
//        double total = (amount * (1.0 + (tax/100))) + (amount * (tip/100));
//        String tip_to_print = String.format( "%.2f", (amount * (tip/100)));
//        String tax_to_print = String.format( "%.2f",((amount * (1.0 + (tax/100)) - amount)));
//        String before_tax  = String.format( "%.2f",(amount + (amount * (tip/100))));
//        String before_tip = String.format( "%.2f",(amount * (1.0 + (tax/100))));
//
////printing everything out
//        System.out.println("\nYour total is $" + String.format( "%.2f",total));
//        System.out.println("\nTip is $ " + tip_to_print);
//        System.out.println("\nTotal before tip is $" + before_tip);3
//        System.out.println("\nYour tax is $" + tax_to_print);
//        System.out.println("\nBefore tax your bill is $ " + before_tax);
//

//    int x = 0;
//    int y = 2;
//    int z = x++ * --y + 2;
//    System.out.println(z);

//        System.out.print("Hello Java\n.\n.");
