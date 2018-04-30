//Your Name: Jacob Duchen
//Today's Date: 4/29/18

/*
  All of conditionals II's excercises. There is a loop that allows user to navigate between exercises. Simply input a string to break program and exit.
*/

import java.util.Scanner;

public class ConditionalsII {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        Integer choice;

        for (Double j = 1.0; j <= 10; ) {


            System.out.println("Options \n");
            System.out.println("1. Write a Java program to get a number from the user and print whether it is positive or negative.\n");
            System.out.println("2. Take three numbers from the user and print the greatest number\n");
            System.out.println("3. Write a Java program that reads a double (number with decimal places) and prints \"zero\" if the number is zero. \nOtherwise, print \"positive\" or \"negative\". Add \"small\" if the absolute value of the number is less than 1, or \"large\" if it exceeds 1,000,000\n");
            System.out.println("4. Write a Java program that takes the user to provide a single character from the alphabet. \nPrint Vowel or Consonant, depending on the user input. If the user input is a string of length > 1, print an error message.\n");
            System.out.println("Please select which program you would like to see by entering the corresponding digit: ");
            System.out.println("To terminate program, input anything aside from digits 1-4 \n");

            if (userInput.hasNextInt()) {
                choice = userInput.nextInt();
            } else {
                choice = 5;
            }


            //variable choice will default to 4 if user puts in a non-integer

            if (choice == 1) {
                Integer number;

                System.out.println("Enter a number and lets find out if is positive, negative, or neutral:\n");

                if (userInput.hasNextInt()) {
                    number = userInput.nextInt();
                } else {
                    number = 9999;
                }

                if (number == 9999) {
                    System.out.println("Error!!!\n");
                } else if (number > 0) {
                    System.out.println("Positive!!!\n");
                } else if (number == 0) {
                    System.out.println("Neutral\n");
                } else if (number < 0) {
                    System.out.println("Negative!!!\n");
                }
            } else if (choice == 2) {
                System.out.println("2. Take three numbers from the user and print the greatest number");
                System.out.println("Input first number: ");
                Integer number1, number2, number3;

                if (userInput.hasNextInt()) {
                    number1 = userInput.nextInt();
                } else {
                    number1 = 9999;
                }
                System.out.println("Input second number: ");

                if (userInput.hasNextInt()) {
                    number2 = userInput.nextInt();
                } else {
                    number2 = 9999;
                }

                System.out.println("Input third number: ");

                if (userInput.hasNextInt()) {
                    number3 = userInput.nextInt();
                } else {
                    number3 = 9999;
                }
                int[] myList = {number1, number2, number3};
                int largest = myList[0];

                for (int i = 0; i < myList.length; ++i) {
                    if (myList[i] > largest) {
                        largest = myList[i];
                    }
                }

                System.out.println(largest + " is your biggest number inputted!");

            } else if (choice == 3) {

                System.out.println("3. Write a Java program that reads a double (number with decimal places) and prints \"zero\" if the number is zero. \nOtherwise, print \"positive\" or \"negative\". Add \"small\" if the absolute value of the number is less than 1, or \"large\" if it exceeds 1,000,000");

                Double numberTest;

                System.out.println("Enter a number to test:\n");

                if (userInput.hasNextDouble()) {
                    numberTest = userInput.nextDouble();
                } else {
                    numberTest = 99999.38;
                }


                if (numberTest == 99999.38) {
                    System.out.println("error\n");
                } else if (numberTest == 0.0) {
                    System.out.println("zero\n");
                } else if (numberTest > 0.0) {
                    System.out.println("Positive\n");
                } else if (numberTest < 0.0) {
                    System.out.println("Negative\n");
                }

                if (Math.abs(numberTest) < 1.0) {
                    System.out.println("small\n");
                }

                if (Math.abs(numberTest) > 1000000.0) {
                    System.out.println("large\n");
                } else if (choice == 4) {
                    System.out.println("You quit or something broke :) \n");
                }



            }
            else if (choice == 4) {
                char letter = 'b';

                System.out.println("4. Write a Java program that takes the user to provide a single character \n" +
                        "   from the alphabet. Print Vowel or Consonant, depending on the user input. \n" +
                        "   If the user input is a string of length > 1, print an error message.");

                System.out.println("Input a letter: \n");

                if (userInput.next().length() > 1)
                {
                    System.out.println("Error. Not a single character.");
                } else {
                    letter = userInput.next().charAt(0);
                    letter = Character.toLowerCase(letter);
                }

//                System.out.println(letter);

                if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                    // we have a vowel
                    System.out.println("\nYou have provided a vowel");

                } else {
                    System.out.println("\nInput letter is Consonant");
                }

            } else {
                System.out.println("\nProgram Terminated");
                break;
            }
            //end of choice if/else statement ^
        }
        //end of loop ^
    }
    //end of method ^
}
//end of class