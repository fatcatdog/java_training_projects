//Your Name: Jacob Duchen
//Today's Date: 4/29/18

/*
Day of the Week exercise from Conditionals I.
*/

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        System.out.println("Here are your options:\n1 -> Monday \n2 -> Tuesday \n3 -> Wednesday \n4 -> Thursday \n5 -> Friday \n6 -> Saturday \n7 -> Sunday \nAnything Else -> Error\nPlease enter an integer (1-7):\n");

        //using scanner
        Scanner userInput = new Scanner(System.in);

        //variable choice will default to 8 if user puts in a non-integer
        Integer choice;
        String day;

        //making sure choice input wont break program, or at least trying to do that
        if (userInput.hasNextInt()) {
            choice = userInput.nextInt();
        } else {
            choice = 8;
        }

        //conditionals part of program

        if (choice == 1) {
            day = "Monday";
        } else if (choice == 2) {
            day = "Tuesday";
        } else if (choice == 3) {
            day = "Wednesday";
        } else if (choice == 4) {
            day = "Thursday";
        } else if (choice == 5) {
            day = "Friday";
        } else if (choice == 6) {
            day = "Saturday";
        } else if (choice == 7) {
            day = "Sunday";
        } else {
            day = "error";
        }

        //printing out integer turned into string answer
        System.out.println("Weekday " + choice + " is " + day + "!");
    }
    //end of main method
}
//end of class