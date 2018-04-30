//Your Name: Jacob Duchen
//Today's Date: 4/29/18

/*
 All of Week 3's Array Exercises
*/

import java.util.Scanner;
import java.util.Arrays;


public class ArraysI {
    public static void main(String[] args) {

        for (Double j = 1.0; j <= 10; ) {

            System.out.println(
                "\nPlease input the integer value of the exercise you want to see:\n\n" +
                        "1. Copy an Array\n" +
                        "2. Find a value in an Array\n" +
                        "3. Largest Value\n" +
                        "4. How many times\n" +
                        "5. Comma seperated values\n\n" +
                        "To terminate program enter anything aside from 1-5:)\n"
        );

        Scanner userInput = new Scanner(System.in);

        //variable choice will default to 4 if user puts in a non-integer
        Integer choice;
        //program wont break if they input bad number or non-integer
        if (userInput.hasNextInt()) {
            choice = userInput.nextInt();
        } else {
            choice = 6;
        }

        if (choice == 1) {
            System.out.println("1. Copy an Array\n");

            int[] data = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//            System.out.println(data);

            int[] arr = new int[10];

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

            int[] data = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

            System.out.println("Our Array\n");
            System.out.println(Arrays.toString(data) + "\n");

            System.out.println("Please input an integer value you hope is in our array: \n");
            int numberGuess = userInput.nextInt();

            int nopeNotInThere = 0;

            for (int i = 0; i < data.length; i++) {
                if (data[i] == numberGuess) {
                    System.out.println("Your value was found at position " + i + "\n");
                    nopeNotInThere = 1;
                    break;
                }
            }
            if (nopeNotInThere == 0) {
                System.out.println("Nope not in there");
            }
        }
        //end of choice 2

        else if (choice == 3) {
            int[] data = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

            System.out.println("3. Largest Value\n");

            int largest = data[0];

            for (int i = 0; i < data.length; i++) {
                if (data[i] > largest) {
                    largest = data[i];
                }
            }

            System.out.println("The largest Value is " + largest + " \n");
        }
        //end of choice 3

        else if (choice == 4) {
            System.out.println("4. How many times\n");
            int[] data = {10, 20, 10, 20, 50, 60, 70, 50, 60, 30};

            System.out.println("Our Array\n");
            System.out.println(Arrays.toString(data) + "\n");

            System.out.println("Input a number in the array and we will tell you how many times its in there: \n");

            int amountInArray = 0;

            int numberGuess = userInput.nextInt();

            for (int i = 0; i < data.length; i++) {
                if (numberGuess == data[i]) {
                    amountInArray++;
                }
            }

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

            String sentence;
            //program wont break if they input bad string or non-string
            if (userInput.hasNext()) {
                sentence = userInput.next();
            } else {
                sentence = "";
            }

            String[] words = sentence.split(",");

            System.out.println(Arrays.toString(words) + "\n");

        }
        //end of choice 5
        else if (choice == 6) {
            System.out.print("Program Terminated :l");
            break;
        }
        //end of choice == 6
    }
    //end of endless loop
    }
    //end of main method
}
//end of class