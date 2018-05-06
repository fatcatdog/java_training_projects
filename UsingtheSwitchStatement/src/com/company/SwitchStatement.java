package com.company;
/*
@author jacob duchen
        these are the switch statement exercises 10-14 from week 2 assignments
*/

//bringing in scanner
import java.util.Scanner;
//class name SwitchStatement
public class SwitchStatement {

    //public available to other classes
    //static belongs to class not an instance of class
    // void undetermined return value
    //accepts string args

    public static void main(String[] args) {
        //variable for navigating all exercises in an endless loop
        int choice;

        //bringing in scanner
        Scanner userInput = new Scanner(System.in);

        //endless loop
        for (Double randomLoop = 1.0; randomLoop <= 3.0; ) {

        //user input to navigate exercises
            //can input a non-1-5 integer to exit

            System.out.println("Please input 1-5 to view the different exercises in this program: " +
                    "\n1. Ex. 10 Weekday exercise\n" +
                    "2. Ex. 11 Other Weekday exercise\n" +
                    "3. Ex. 12 Cards exercise\n" +
                            "4. Vowel and Consonant counter\n\n" +
                    "Input anything aside from 1-4 to exit\n\n"
            );
            //scanner input will dictate what user sees in program

        if (userInput.hasNextInt()) {
            choice = userInput.nextInt();
        } else {
            //choice will end program
            choice = 6;
        }

        if (choice == 1) {
            System.out.println( "\n1. Ex. 10 Weekday exercise\n");
            //initializeing variables
        int dayNumber = 1;
        String day ="";
//switch statement to get string based on number input
        switch ( dayNumber ){
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
        }

        System.out.println( "the day is = " + day );
        } else if (choice == 2) {
            System.out.println("2. Ex. 11 Other Weekday exercise\n" );
            //initiatilizing and assigning variables
        String day ="Monday";
        int dayNumber = 1;

//returning numbers based on string inputs
        switch ( day ){
            case "Monday":
                dayNumber = 1;
                break;
            case "Tuesday":
                dayNumber = 2;
                break;
            case "Wednesday":
                dayNumber = 3;
                break;
            case "Thursday":
                dayNumber = 4;
                break;
            case "Friday":
                dayNumber = 5;
                break;
            case "Saturday":
                dayNumber = 6;
                break;
            case "Sunday":
                dayNumber = 7;
                break;
        }

        System.out.println( "the daynumber is = " + dayNumber );
        } else if (choice == 3) {
            System.out.println("3. Ex. 12 Cards exercise\n");
            //this dead variable was from an old stratedgy that i didnt end up using
        int[] numbers = {0, 1, 2, 3};

            //initializing suits array
        String[] suits = {"Hearts", "Clubs", "Spades", "Diamonds"};
//initiatings random suit
        String randomSuit = suits[(int)(Math.random()*4)];
        Integer randomNumber = numbers[(int)(Math.random()*4)];
//assigning and declaring a variable for our switch statement
        int suitNumValue = -1;
//
//        System.out.println(randomNumber);
//        System.out.println(randomSuit);

            //based on number input will return suit name
        switch (randomSuit){

            case "Hearts":
         suitNumValue =  0;
            break;
            case "Diamonds":
        suitNumValue =  1;
            break;
            case "Spades":
        suitNumValue =  2;
            break;
            case "Clubs":
        suitNumValue =  3;
            break;
        }

        System.out.println("Your card is a " + randomNumber + " suit of " + randomSuit + " which equals " + suitNumValue + " in our exercise");
        } else if (choice == 4) {
            System.out.println("4. Vowel and Consonant counter\n\n");
            //declaring and assigning variables
            int vowelCount = 0;
            int consonantCount = 0;
            char letter;
//endless loop unless user inputs a 5
            for (Double j = 1.0; j <= 3.0; ) {
                System.out.println("Please input a letter and we will tell you vowel vs consonant score: \n\n" +
                        "(To exit, input the number 5)");
                //getting user letter input
                letter = userInput.next().charAt(0);

//switch statement to incriment vowels and non vowels
                switch (letter) {
                    case 'a':
                    case 'A':
                    case 'e':
                    case 'E':
                    case 'i':
                    case 'I':
                    case 'O':
                    case 'o':
                    case 'u':
                    case 'U':
                        vowelCount++;
                        System.out.println("You have " + vowelCount + " vowels and " + consonantCount + " consonants");
                        break;
                    case '5':
                        j = 3.1;
                        return;
                    default:
                        consonantCount++;
                        System.out.println("You have " + vowelCount + " vowels and " + consonantCount + " consonants");
                        break;
                }
            }


            System.out.println("You have " + vowelCount + " vowels and " + consonantCount + " consonants");
        }
        else {
            //breaking endless loop if user inputs something other than 1-4
            return;
        }

    }
    }
}
