/*
@author = jacob duchen
@data = 5/3/18
 */

//importing scanner

import java.util.Scanner;

public class BasicLoops {
    //main method
    public static void main(String[] args) {
//endless loop to let the user navigate through different programs
        for (int endlessLoop = 1; endlessLoop <= 10; ) {

            System.out.println(
                    "\nPlease input the integer value of the exercise you want to see:\n\n" +
                            "1. PIN Number\n" +
                            "2. Guess the number\n" +
                            "3. Counting\n" +
                            "4. Hi-Lo\n" +
                            "5. Adding values\n" +
                            "6. All Even Numbers\n" +
                            "7. Squares\n" +
                            "8. Pattern\n" +
                            "9. A more complicated Pattern\n" +
                            "To terminate program enter anything aside from 1-10:)\n"
            );
//using scanner as userInput
            Scanner userInput = new Scanner(System.in);

            //variable choice will default to 10 if user puts in a non-integer
            Integer choice;
            //program wont break if they input bad number or non-integer
            if (userInput.hasNextInt()) {
                choice = userInput.nextInt();
            } else {
                //if choice is not an inte we default to 10
                choice = 10;
            }

//first exercise if user inputs choice == 1
            if (choice == 1) {
//declaring variables
                Integer pin_code_guess;
                Integer pin_code;

                System.out.println("\n1. PIN Number\n");
                System.out.println("\nPlease input a 4 digit integer and remember it because its your pin code now\n");
//getting user input, if non-integer we default to -1
                if (userInput.hasNextInt()) {
                    pin_code = userInput.nextInt();
                } else {
                    pin_code = -1;
                }

                System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("\nWelcome back, please enter your pin code to access this virtual bank: \n");
//getting user to try remember what there pin_code was
                if (userInput.hasNextInt()) {
                    pin_code_guess = userInput.nextInt();
                } else {
//getting user input, if non-integer we default to -1
                    pin_code_guess = -1;
                }

                //program wont break if they input bad number or non-integer
                if ((pin_code_guess - pin_code != 0)) {
                    System.out.println("INCORRECT PIN. PLEASE TRY AGAIN\n");
                } else if ((pin_code_guess - pin_code == 0)) {
                    System.out.println("PIN ACCEPTED. YOU HAVE $0.00 IN YOUR ACCOUNT. GOODBYE.");
                }
            }
            //end of choice one
            //exercise 2
            else if (choice == 2) {
                System.out.println("\n2. Guess the number\n");
//endless loop to allow user to keep guessing
                for (Double j = 1.0; j <= 10; ) {

                    System.out.println("\nGuess a number between 1 and 10:\n");
//declaring and assigning variables
                    Integer realNumber = 7;
                    Integer guess;

                    if (userInput.hasNextInt()) {
                        guess = userInput.nextInt();
                    } else {
                        guess = -1;
                    }
//business logic here. if guess is the same as 7! you win, otherwise nope, guess again..
                    if (guess - realNumber == 0) {
                        System.out.println("Correct!");
                        break;
                    } else {
                        System.out.println("Nope!");
                    }

                }
                //end of loop
            }
            //end of choice 2
//exercise 3
            else if (choice == 3) {

                System.out.println("3. Counting\n");

                System.out.println("We are going to print 1 to the number you input. What number would you like to print up to today: \n");
//declaring maxnumber variable
                Integer userMaxNum;
//if non-int we default to 1
                if (userInput.hasNextInt()) {
                    userMaxNum = userInput.nextInt();
                } else {
                    userMaxNum = 1;
                }
                //we only print numbers if they are greater than 1
                //we do that with a for loop inside this if statement
                if (userMaxNum > 1) {
                    for (int i = 1; i <= userMaxNum; i++) {
                        System.out.println(i);
                    }
                }

            }
            //end of choice 3
            //exercise 4
            else if (choice == 4) {
                //assigning variables
                int counter = 0;
                int secretNumber = 27;

                System.out.println("4. Hi-Lo\n");
                System.out.println("Guess a number between 1 and 100 until your guess is correct:");
                //endless loop will break if user guesses correct, or chooses to quit
                for (Double j = 1.0; j <= 10; ) {
//guess starts at 0 when we assign it here
                    Integer guess = 0;
//if userinputsnon-number we default to 0
                    if (userInput.hasNextInt()) {
                        guess = userInput.nextInt();
                    } else if (userInput.hasNextInt()) {
                        guess = 0;
                    }
//same here if number is greater than 100 we default to 0
                    if (guess > 100) {
                        guess = 0;
                    } else if (guess < 1) {
                        guess = 0;
                    }
//logic for checking if number is right, and logging attempt at game
                    if (guess > secretNumber) {
                        System.out.println("Lower");
                        counter++;
                    } else if (guess < secretNumber) {
                        System.out.println("Higher");
                        counter++;
                    } else if (guess - secretNumber == 0) {
                        counter++;
                        System.out.println("Correct\n");
                        System.out.println("That took " + counter + " tries.\n");
                        break;
                    } else if (guess == 0) {
                        //not telling user the correct answer here
                        System.out.println("You have given up after " + counter + " tries.");
                        break;
                    }
                }
                //end of choice 4
//exercise 5
            } else if (choice == 5) {
                System.out.println("5. Adding values\n");
                System.out.println("Please input one integer at a time and we will add to counter:\n");
                System.out.println("(To see your total and stop adding numbers. Please input a 0)\n\n");
//declaring and assinging variables here
                Integer numberInput = 0;
                Integer counter = 0;
//for each input, we iterate up until ten
                for (int i = 0; i < 10; ) {

                    if (userInput.hasNextInt()) {
                        numberInput = userInput.nextInt();
                    } else {
                        numberInput = 0;
                    }

                    if (numberInput == 0) {
                        //here we print the counter
                        System.out.println("All of your numbers add to " + counter);
                        break;
                    }
                    //here we add the counter
                    counter += numberInput;

                }
                //end of loop

            }
            //end of choice 5
            //exercise 6
            else if (choice == 6) {
                System.out.println("6. All Even Numbers\n\n");
                System.out.println("Please Input a number and we will tell you all the even numbers up to that number: \n");
//declaring variable
                Integer numberInput;
//getting user input with an exit = 2 as well
                if (userInput.hasNextInt()) {
                    numberInput = userInput.nextInt();
                } else {
                    numberInput = 2;
                }
//printing all the multiples of 2 up to the inputted numbere in this for loop
                for (int i = 2; i <= numberInput; i = i + 2) {
                    System.out.println(i);
                }


            }
            //end of choice 6
            //exercise 7
            else if (choice == 7) {
                System.out.println("7. Squares\n");
                System.out.println("We are going to square every number upto an integer that you input. First input an integer: \n");
//declaring variable
                Integer numberInput;
//getting user input non-ints will default to 0
                if (userInput.hasNextInt()) {
                    numberInput = userInput.nextInt();
                } else {
                    numberInput = 0;
                }
//if 0 we return this
                if (numberInput == 0) {
                    System.out.println("The square of 0 is 0?");
                } else {
                    //we should them the squares here in this loop
                    for (int i = 1; i <= numberInput; i++) {
                        System.out.println(i * i);
                    }
                }
            }
            //end of choice 7
            //choice 8
            else if (choice == 8) {
                System.out.println("8. Pattern\n");
                System.out.println("Input a number and we will build a pyramid up to that number: \n");
//declaring variable
                Integer numberInput;
//getting user input
                if (userInput.hasNextInt()) {
                    numberInput = userInput.nextInt();
                } else {
                    numberInput = 0;
                }
//default error statement
                if (numberInput == 0) {
                    System.out.println("0 or Invalid input");
                } else {
                    //we build a pyramid with the input being the final char in the final row
                    for (int i = 1; i <= numberInput; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(i);
                        }
                        System.out.println();
                    }
                }
            }
            //end of choice 8
            //chioce 9
            else if (choice == 9) {
                System.out.println("9. A more complicated Pattern\n");
                System.out.println("Input a number and we will build a pyramid with that many lines: \n");
//declaring variable
                Integer numberInput;
//getting user input
                if (userInput.hasNextInt()) {
                    numberInput = userInput.nextInt();
                } else {
                    numberInput = 0;
                }
//error statement if input is 0
                if (numberInput == 0) {
                    System.out.println("0 or Invalid input");
                } else {
//i will set the pattern for each line
                    for (int i = 0; i < numberInput; i++) {
                        //j will set the pattern for each number of spaces
                        for (int j = 0; j < numberInput - i; j++) {
                            System.out.print(" ");
                        }
                        //k will set the pattern for actual * with a space attached to it to keep pyramid looking consistent
                        for (int k = 0; k <= i; k++) {
                            System.out.print("* ");
                        }
                        //newline
                        System.out.println();
                    }
                }
                //end of else statement
            }
            //end of chioce == 9
            else if (choice == 10) {
                System.out.println("Program Terminated :l");
                break;
            }
        }
        //end of endless loop
    }
    //end of method
}
//end of class