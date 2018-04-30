// ============================================================================
//   Copyright 2018 Jacob Duchen
//
//   Licensed under the Apache License, Version 2.0 (the "License");
//   you may not use this file except in compliance with the License.
//   You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
//   Unless required by applicable law or agreed to in writing, software
//   distributed under the License is distributed on an "AS IS" BASIS,
//   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//   See the License for the specific language governing permissions and
//   limitations under the License.
// ============================================================================


import java.util.Scanner;
/**
 * @author Jacob Duchen
 */
public class MathExercises {
    public static void main(String[] args) {

        //lets declare some variables
        Double tempInCel;
        Double tempInFar;
        Double distanceInInches;
        Double distanceInMeters;
        Integer firstNum;
        Double numnum;
        Integer secondNum;
        Integer productAnswer;
        Integer choice;

        //this loop makes the program run until the user decides to quit by entering a string or an integer greater than 4
        for (Double j = 1.0; j <= 10; ) {


            //Getting input(Scanner) from a user and then assigning input to integer for our if/then statement

            Scanner input = new Scanner(System.in);
//directions for the user to navigate program
            System.out.println("\nWhat would you like to do today? (Press 1 through 4 to do the following)\n\n1. Write a Java program to convert temperature from Fahrenheit to Celsius degree.\n" +
                    "2. Write a Java program that reads a number in inches, converts it to meters.\n" +
                    "3. Write a Java program that takes two numbers as input and display the product of two numbers.\n" +
                    "4. Write a Java program that takes a number and prints the results of it multiplied from 1 to 10\n" +
                    "\nIf you would like to quit the program, simply type 'Quit' or 'Escape', or any letter... :)");

//to prevent a string input from crashing program, this logic will set choice to an integer and exit program
            if (input.hasNextInt()) {
                choice = input.nextInt();
            } else {
                choice = 5;
            }

            //based on user input, this logic then allows user to choose what exercises they can interact with
            if (choice == 1) {

                System.out.println("Input a degree in Fahrenheit (Make sure you input some digits not letters!):");
                tempInFar = input.nextDouble();
                tempInCel = (tempInFar - 32) * (5 / 9.0);
                System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println(tempInFar + " degrees Fahrenheit equals " + tempInCel + " degrees Celsius");
                System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");

            } else if (choice == 2) {

                System.out.println("Input a number of inches and I will tell you how many meters that is (Please enter a digit):");
                distanceInInches = input.nextDouble();
                distanceInMeters = (distanceInInches * 0.0254);
                System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println(distanceInInches + " inches equals " + distanceInMeters + " meters.");
                System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");

            } else if (choice == 3) {
                System.out.println("Lets do some multiplication! Please enter your first number");
                firstNum = input.nextInt();
                System.out.println("Please enter your second number");
                secondNum = input.nextInt();
                productAnswer = firstNum * secondNum;
                System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println(firstNum + " multiplied by " + secondNum + " equals " + productAnswer);
                System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
            } else if (choice == 4) {
                System.out.println("Input any number in the world and we can look at its multiplication table 1 through 10");
                numnum = input.nextDouble();

                for (Double i = 1.0; i <= 10; i++) {
                    System.out.println(Math.round(numnum) + " x " + Math.round(i) + " = " + Math.round(numnum * i));
                }

            } else {
                //this logic exits the program loop
                System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("Oops, you either decided to exit the program, accidently inputted a non-number, or something broke! Thanks for stopping by! Feel free to rerun the program");
                System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");

                break;
            }
        }
    }
}
