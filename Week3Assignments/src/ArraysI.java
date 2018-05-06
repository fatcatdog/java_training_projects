//Your Name: Jacob Duchen
//Today's Date: 4/29/18

/*
 All of Week 3's Array Exercises
*/

//importing some java packages

import java.util.Scanner;
import java.util.Arrays;

//public class named arrayI
public class ArraysI {
    //public = available to other classes
    //static = dont need an  obj of class to work
    //void = unknownn return type
    //main = string name
    //string args accepted
    public static void main(String[] args) {
//endless loop to allow user to navigate program
        for (Double j = 1.0; j <= 10; ) {

            //user sees options printed here
            System.out.println(
                    "\nPlease input the integer value of the exercise you want to see:\n\n" +
                            "1. Copy an Array\n" +
                            "2. Find a value in an Array\n" +
                            "3. Largest Value\n" +
                            "4. How many times\n" +
                            "5. Comma seperated values\n\n" +
                            "To terminate program enter anything aside from 1-5:)\n"
            );
//bringing in scanner
            Scanner userInput = new Scanner(System.in);

            //variable choice will default to 6 if user puts in a non-integer
            Integer choice;
            //program wont break if they input bad number or non-integer
            if (userInput.hasNextInt()) {
                choice = userInput.nextInt();
            } else {
                choice = 6;
            }
//depending on that user inputs with choice, they will see different exercises
            if (choice == 1) {
                System.out.println("1. Copy an Array\n");
//declaring and assigning array called data
                int[] data = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//            System.out.println(data);
//declaring an empty new array 10 length
                int[] arr = new int[10];
//for each piece of arr, data will be put in in this loop
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = data[i];
                }

                System.out.println("Original\n");
                System.out.println(Arrays.toString(data) + "\n");
                System.out.println("New Array\n");
                System.out.println(Arrays.toString(arr));
            }

//end of choice 1

            else if (choice == 2) {
                System.out.println("2. Find a value in an Array\n");
//declaring and assigning array called data

                int[] data = {10, 20, 30, 40, 50, 60, 70, 80, 90, 50, 100};

                System.out.println("Our Array\n");
                System.out.println(Arrays.toString(data) + "\n");

                System.out.println("Please input an integer value you hope is in our array: \n");
                int numberGuess = userInput.nextInt();
//counter  value to know when to not return not in there statement i.e. value will change after all of loop is run
                int nopeNotInThere = 0;

                //loop through all of array, if data[i] == numberGuess, change nopenotinthere, and return success statemeent
                for (int i = 0; i < data.length; i++) {
                    if (data[i] == numberGuess) {
                        System.out.println("Your value was found at position " + i + "\n");
                        nopeNotInThere = 1;
                        //stop looping with this break
                    }
                }
                //if value was never found, nopenotinthere is still 0
                if (nopeNotInThere == 0) {
                    System.out.println("Nope not in there");
                }
            }
            //end of choice 2

            else if (choice == 3) {
                //declaring and assigning array called data

                int[] data = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

                System.out.println("3. Largest Value\n");
//randomy setting first piece of array to be biggest value placeholder
                int largest = data[0];
//if iterator finds a biggger value, that newvalue takes largest place
                for (int i = 0; i < data.length; i++) {
                    if (data[i] > largest) {
                        //here is where we set biggest value
                        largest = data[i];
                    }
                }

                System.out.println("The largest Value is " + largest + " \n");
            }
            //end of choice 3

            else if (choice == 4) {
                System.out.println("4. How many times\n");
                //declaring and assigning array called data

                int[] data = {10, 20, 10, 20, 50, 60, 70, 50, 60, 30};

                System.out.println("Our Array\n");
                System.out.println(Arrays.toString(data) + "\n");

                System.out.println("Input a number in the array and we will tell you how many times its in there: \n");
//initial counter is 0
                int amountInArray = 0;
//getting user input
                int numberGuess = userInput.nextInt();
//looping through array, if numberguess is found, we add 1 to counter
                for (int i = 0; i < data.length; i++) {
                    if (numberGuess == data[i]) {
                        amountInArray++;
                    }
                }
//printing statements, if answer is 0, grammer is different
                if (amountInArray == 1) {
                    System.out.println(numberGuess + " appears " + amountInArray + " time in the array.");
                } else {
                    System.out.println(numberGuess + " appears " + amountInArray + " times in the array.");
                }

            }
            //end of choice 4

            else if (choice == 5) {
                System.out.println("5. Comma seperated values\n\n");

                System.out.println("input multiple words seperated by commas (,):\n");
//declaring a string
                String sentence;
                //program wont break if they input bad string or non-string
                if (userInput.hasNext()) {
                    sentence = userInput.next();
                } else {
                    sentence = "";
                }
//creating an array of string words by splitting at every ,
                String[] words = sentence.split(",");
//printing to user
                System.out.println(Arrays.toString(words) + "\n");

            }
            //end of choice 5
            //any non 1-5 input at the choice loop will default to 6 and quit program
            else if (choice == 6) {
                System.out.print("Program Terminated :l");
                //ending the program if the user wants to quit
                break;
            }
            //end of choice == 6
        }
        //end of endless loop
    }
    //end of main method
}
//end of class