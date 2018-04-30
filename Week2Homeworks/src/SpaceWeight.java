//Your Name: Jacob Duchen
//Today's Date: 4/29/18

/*
  Space weight exercise from Conditionals I.
*/

import java.util.Scanner;

public class SpaceWeight {
    public static void main(String[] args) {
        System.out.println("I have information for the following planets:\n\n" +
                "1. Venus\n" +
                "2. Mars\n" +
                "3. Jupiter\n" +
                "4. Saturn\n" +
                "5. Uranus\n" +
                "6. Neptune\n\n" +
                "Which planet are you visiting? \n"
        );


        Scanner userInput = new Scanner(System.in);

        //variable choice will default to 7 if user puts in a non-integer
        Integer choice;
        Double weight;
        Double spaceweight;

        //making sure input doesnt crash program
        if (userInput.hasNextInt()) {
            choice = userInput.nextInt();
        } else {
            choice = 7;
        }

        System.out.println("How much do you weigh on earth?:\n");
        weight = userInput.nextDouble();

        //multiplying input by planets gravitational difference

        if (choice == 1) {
            spaceweight = (weight * 0.78);
        } else if (choice == 2) {
            spaceweight = (weight * 0.39);
        } else if (choice == 3) {
            spaceweight = (weight * 2.65);
        } else if (choice == 4) {
            spaceweight = (weight * 1.17);
        } else if (choice == 5) {
            spaceweight = (weight * 1.05);
        } else if (choice == 6) {
            spaceweight = (weight * 1.23);
        } else {
            spaceweight = weight;
        }
//printing out string with variables in it
        System.out.println("Your " + weight + " (lbs/kilos) would be " + spaceweight + " (lbs/kilos) on that planet.\n");
    }
//end of main method
}
//end of class ^

