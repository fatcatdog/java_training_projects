//Your Name: Jacob Duchen
//Today's Date: 4/29/18

/*
 4 of conditional I's first exercsies. Space Weight and Day of the Week exercises are in different class files.
*/

import java.util.Scanner;

public class ConditionalsI {
    public static void main(String[] args) {

//giving a user a menu to choose what excersices they want to see. if they enter 1, choice will send them to the choice == 1 if else statement
        System.out.println(
                "\nChoose Your Fait\n\n" +
                        "1. What if...\n" +
                        "2. Legal problems\n" +
                        "3. Cars or Buses\n" +
                        "4. Specific legal problems\n"
        );

        Scanner userInput = new Scanner(System.in);

        //variable choice will default to 4 if user puts in a non-integer
        Integer choice;
//program wont break if they input bad number or non-integer
        if (userInput.hasNextInt()) {
            choice = userInput.nextInt();
        } else {
            choice = 7;
        }

        if (choice == 1) {
            System.out.println("1. What if...\n");
            Integer people = 9;
            Integer cats = 3;
            Integer dogs = 3;

            //if there are more cats than people this statement will print
            if (people < cats) {
                System.out.println("Too many cats! The world is doomed!");
                //if there are more people than cats this statement will print
            }
            if (people > cats) {
                System.out.println("Too few cats! The world is saved for another day!");

            } //if there are more dogs than people this will print
            if (people < dogs) {
                System.out.println("The world is drooled on!");
                //if there are more people than dogs this will print
            }
            if (people > dogs) {
                System.out.println("The world is dry!");
                //if everything is equal this prints
            } else {
                System.out.println("Looks like your values are equal to each other!");
            }
        } else if (choice == 2) {
            System.out.println("2. Legal problems\n");
            String name;
            Integer age;

            System.out.println("Whats your name stranger?");
            name = userInput.next();
            System.out.println("Whats your age if you dont mind me asking?");
            age = userInput.nextInt();

            if (age < 16) {
                System.out.println("You can't drive, " + name);
            }

            if (age < 18) {
                System.out.println("You can't vote, " + name);
            }

            if (age < 25) {
                System.out.println("You can't rent a car, " + name);
            }

            if (age > 25) {
                System.out.println("You can do anything that's legal, " + name);
            }
        } else if (choice == 3) {
            System.out.println("3. Cars or Buses\n");
            Integer people = 4;
            Integer cars = 9;
            Integer buses = 3;

            if (cars > people) {
                System.out.println("We should take the cars");
            } else if (cars < people) {
                System.out.println("We should not take the cars.");
            } else {
                System.out.println("We can't decide.");
            }

            if (buses > cars) {
                System.out.println("That's too many buses.");
            } else if (cars > buses) {
                System.out.println("Maybe we should take the buses.");
            } else {
                System.out.println("We still can't decide.");
            }

            if (people > buses) {
                System.out.println("Let's just take the cars.");
            }

//i believe else acts as a default once previous conditions fail
//i think else if allows an eithor or type conditional. If the first if fails, but it passes the next if else, this conditional will be true, but not as a default
//removing an else will mess up the conditional, java will need you to seperate the else into a different conditional system
        }
else if (choice == 4) {
            System.out.println("4. Specific legal problems\n");

            String name;
            Integer age;

            System.out.println("Whats your name stranger?");
            name = userInput.next();
            System.out.println("Whats your age if you dont mind me asking?");
            age = userInput.nextInt();

            if (age < 16) {
                System.out.println("You can't drive, " + name);
            }

            else if (age < 18) {
                System.out.println("You can't vote, " + name);
            }

            else if (age < 25) {
                System.out.println("You can't rent a car, " + name);
            }

            else if (age > 25) {
                System.out.println("You can do anything that's legal, " + name);
            }
        }
        else {
            System.out.println("Program terminated :(");
        }
        //end of if else choice conditional ^

        }
        //end of main method ^
}
//end of class ^