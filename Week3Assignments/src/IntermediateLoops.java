//Your Name: Jacob Duchen
//Today's Date: 4/29/18

/*
intermediate loops exercise
*/

//scanner package

import java.util.Scanner;

public class IntermediateLoops {
    public static void main(String[] args) {
//loop to allow user to navigate in between exercises
        for (int RandomEndlessLoop = 1; RandomEndlessLoop < 10; ) {

            System.out.println("\n1. The Legendary FizzBuzz\n" +
                    "2. The Halving Machine\n" +
                    "3. Letter at a time\n" +
                    "4. Coordinates in a plane\n" +
                    "\nEnter anything aside from 1-4 to exit\n");
//bringing in scanner
            Scanner userInput = new Scanner(System.in);

            //variable choice will default to 5 if user puts in a non-integer
            Integer choice;
            //program wont break if they input bad number or non-integer
            if (userInput.hasNextInt()) {
                choice = userInput.nextInt();
            } else {
                choice = 5;
            }

            if (choice == 1) {
                System.out.println("1. The Legendary FizzBuzz\n\n");
                System.out.println("Please input a number and we will FizzBuzz it: \n\n");
//declaring variable
                Integer inputNumber;

                //program wont break if they input bad number or non-integer
                if (userInput.hasNextInt()) {
                    inputNumber = userInput.nextInt();
                } else {
                    inputNumber = 1;
                }
//looping thgough all nums upto input number
                for (int i = 1; i <= inputNumber; i++) {
                    //if num is divisible by 15
                    if (i % 15 == 0) {
                        System.out.println("FizzBuzz");
                        //if num is divisible by 5

                    } else if (i % 5 == 0) {
                        System.out.println("Buzz");
                        //if num is divisible by 3
                    } else if (i % 3 == 0) {
                        System.out.println("Fizz");
                    } else {
                        System.out.println(i);
                    }
                }
//end of for loop

            }
            //end of choice 1
            else if (choice == 2) {
                System.out.println("\n2. The Halving Machine\n");

                System.out.println("Please input a number and we has halve it a bunch of times: \n\n");
//declaring input from user
                Integer inputNumber;

                //program wont break if they input bad number or non-integer
                if (userInput.hasNextInt()) {
                    inputNumber = userInput.nextInt();
                } else {
                    inputNumber = 1;
                }
//turning num to double
                Double newNumToCalc = inputNumber * 1.0;
//halfing number in the loop
                while (newNumToCalc > 1) {
                    //if its even
                    if (newNumToCalc % 2.0 < 1.0) {
                        //printing a int
                        int num2print = (int) (newNumToCalc / 2.0);
                        //exit when its 1
                        if (num2print == 1) {
                            break;
                        }
                        System.out.println(num2print);
                        //resetting num to calc / 2
                        newNumToCalc = (newNumToCalc / 2.0);
                    } else {
                        //if its odd we add 1 and divide
                        int num2print = (int) ((newNumToCalc + 1) / 2.0);
                        System.out.println(num2print);
                        if (num2print == 1) {
                            break;
                        }
                        //resetting new num to calc to /2
                        newNumToCalc = (newNumToCalc / 2.0);
                    }
                }
            }
            //end of choice 2
            else if (choice == 3) {
                System.out.println("3. Letter at a time");
                System.out.println("\nPlease type a string and we will return an array of letters\n");

                System.out.print("Please enter your full name: ");
//user input
                String word = userInput.next();
                //getting whole line and adding it to one string
                word += userInput.nextLine();
//iterating through string, and printing out a character and an index
                for (int i = 0; i < word.length(); i++) {
                    System.out.println(i + ": " + word.charAt(i));
                }
//reminding user of string original
                System.out.println("\n" + word);
            }
            //end of choice 3
            else if (choice == 4) {
                System.out.println("4. Coordinates in a plane\n\n");

                System.out.println("What is the maximum x?\n");
//gettinguser input x
                Integer x_cord = userInput.nextInt();

                System.out.println("What is the maximum y?\n");
//gettinguser input y

                Integer y_cord = userInput.nextInt();

                System.out.println("\nHere are your possible coordinates:\n");
//looping through 0-0 -> x, y

                //printing all values while we loop
                for (int i = 0; i <= x_cord; i++) {
                    for (int j = 0; j <= y_cord; j++) {
                        System.out.println("(" + i + " , " + j + ")");
                    }
                }

            }
            //end of choice 4
            //exiting program if they input anything that defaults to 5
            else if (choice == 5) {
                System.out.println("Program terminated :l");
                break;
            }
            //end of choice 5
        }
        //end of loop
    }
    //end of main
}
//end of class

