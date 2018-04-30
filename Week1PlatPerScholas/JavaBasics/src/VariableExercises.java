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

public class VariableExercises {
    public static void main(String[] args) {

        // Declaring 1. All about me variables

        String Name; //this is my name
        Integer Age; //this is my age
        Integer Height; //this is my height
        String Eyes; //this is my eye color
        String Teeth; //this is the yellowish color of my teeth
        String Hair; //this is my hair color / style

        // Declaring 2. Carpool variables

        Integer cars;
        Integer drivers;
        Integer passengers;
        Integer cars_not_driven;
        Integer cars_driven;
        Double space_in_a_car;
        Double carpool_capacity;
        Double average_passengers_per_car;
        Double average_miles_driven;
        Double average_miles_per_gallon;
        Double gas_cost_per_gallon;
        Double money_saved;
        Double gas_cost_per_trip;
        Double rounded_price;

        //The choice variable will be assigned to user input, and user will have instructions on what to make input to determine what variables they want to see printed out

        Integer choice;
        //this loop allows user to navigate between exercises
        for (Double j = 1.0; j <= 10; ) {

            // Assigning 1. All about me variables

            Name = "Jacob";
            Age = 26;
            Height = 73;
            Eyes = "brown";
            Teeth = "whiteish";
            Hair = "basically no";

            // Assigning 2. Carpool variables

            cars = 100;
            space_in_a_car = 4.0;
            drivers = 30;
            passengers = 90;
            average_miles_driven = 29.2;
            average_miles_per_gallon = 23.6;
            gas_cost_per_gallon = 2.517;
            cars_not_driven = cars - drivers;
            cars_driven = drivers;
            carpool_capacity = cars_driven * space_in_a_car;
            average_passengers_per_car = (passengers / (cars_driven * 1.0));
            gas_cost_per_trip = average_miles_driven * gas_cost_per_gallon / average_miles_per_gallon;
            money_saved = (gas_cost_per_trip * cars) - (gas_cost_per_trip * cars_driven);
            rounded_price = Math.round(money_saved * 100d) / 100d;

            //Time to get user input and assign Choice variable.

            Scanner input = new Scanner(System.in);
            System.out.println("To learn more about the creator of this program, please type 1 and click enter:\nTo learn some fun facts about carpooling, please type 2 and then click enter:\nTo see a picture of Homer Simpson, press any key and press enter:");
            //if the input is an integer, we can set choice, otherwise....
            if (input.hasNextInt()) {
                choice = input.nextInt();
            } else {
                //if user does not input an integer program breaks. therefore, i defaut all inputs to an integer to prevent crashing
                choice = 4977;
            }

            //logic to allow user to navigate section of programs based on choice variable
            if (choice == 1) {

                // Printing 1. All about me variables
                System.out.println("1. All about me\n");

                System.out.println("Let's talk about " + Name + ".");
                System.out.println("They're " + Height + " inches tall. You could also say they're (" + Math.round(Height / 0.39370) + " cm tall)");
                System.out.println("They're " + Age + " years old.");
                System.out.println("Huh, that's younger than I expected...");
                System.out.println("They have " + Eyes + " eyes and " + Hair + " hair.");
                System.out.println("Their teeth are usually " + Teeth + ", but it depends on the coffee.\n");
            } else if (choice == 2) {

                // Printing 2. Carpool variables
                System.out.println("2. Carpool\n");

                System.out.println("There are " + cars + " cars available.");
                System.out.println("There are only " + drivers + " drivers available.");
                System.out.println("That means there will be " + cars_not_driven + " empty cars today!");
                //We are potentially lying about how many people we can transport
                System.out.println("We can transport " + Math.round(carpool_capacity) + " people today.");
                System.out.println("Out of that, we're transporting " + passengers + " today.");
                System.out.println("So we'll need to put about " + Math.round(average_passengers_per_car) + " in each car.");
                System.out.println("Long story short, today, we'll be saving about $" + rounded_price + "!");
            } else {
                //Error message that will be sent to user if they dont choose 1 or 2
                System.out.println("              ___  _____    \n" +
                        "            .'/,-Y\"     \"~-.  \n" +
                        "            l.Y             ^.          \n" +
                        "            /\\               _\\_ \n" +
                        "           i            ___/\"   \"\\ \n" +
                        "           |          /\"   \"\\   o !   \n" +
                        "           l         ]     o !__./   \n" +
                        "            \\ _  _    \\.___./    \"~\\  \n" +
                        "             X \\/ \\            ___./  \n" +
                        "            ( \\ ___.   _..--~~\"   ~`-.  \n" +
                        "             ` Z,--   /               \\    \n" +
                        "               \\__.  (   /       ______) \n" +
                        "                 \\   l  /-----~~\" /     \n" +
                        "                  Y   \\          / \n" +
                        "                  |    \"x______.^ \n" +
                        "                  |           \\    \n" +
                        "                  I            \\\nThanks for stopping by! ");
               //breaks loop
                break;
            }
        }
    }
}