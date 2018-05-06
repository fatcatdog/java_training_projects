//Your Name: Jacob Duchen
//Today's Date: 4/29/18

/*
All of Conditionals III's exercises. There is a loop to allow user to run each exercise individually.
*/

import java.util.Scanner;

public class ConditionalsIII {
    public static void main(String[] args) {
        Integer choice;

        Scanner userInput = new Scanner(System.in);



        for (Double j = 1.0; j <= 10; ) {

            System.out.println("Enter the digit of the program you want to see: \n");
            System.out.println("1. Name that Shape\n");
            System.out.println("2. Month Name to Number of Days\n");
            System.out.println("3. Name that Triangle\n");
            System.out.println("4. Season from Month and Day\n");

        if (userInput.hasNextInt()) {
            choice = userInput.nextInt();
        } else {
            choice = 15;
        }

        if (choice == 1) {

            Integer sides;
            String polygonName = "";

            System.out.println("1. Name that Shape\n");
            System.out.println("Enter an integer 3-10 to represent an amount of sides. \nThis program will magically produce the name of polygon with that amount of sides\n");

            if (userInput.hasNextInt()) {
                sides = userInput.nextInt();
            } else {
                System.out.println("Not an integer!\n");
                sides = 15;
                return;
            }

            switch (sides) {
                case 3:
                    polygonName = "Triangle";
                    break;
                case 4:
                    polygonName = "Quadrilateral";
                    break;
                case 5:
                    polygonName = "Pentagon";
                    break;
                case 6:
                    polygonName = "Hexagon";
                    break;
                case 7:
                    polygonName = "Heptagon";
                    break;
                case 8:
                    polygonName = "Octagon";
                    break;
                case 9:
                    polygonName = "Nonagon";
                    break;
                case 10:
                    polygonName = "Decagon";
                    break;
                default:
                    polygonName = "Invalid Amount of Sides";
                    break;
            }
            System.out.println(polygonName);
        } else if (choice == 2) {
            System.out.println("2. Month Name to Number of Days\n");
            String monthName;
            String monthDayValue;
for(int endless= 0; endless < 5;) {
    System.out.println("Please type a month (full spelling of month ex. July)(type anything else to exit program): \n");

    monthName = userInput.next();
    monthName = monthName.toLowerCase();

    switch (monthName) {
        case "january":
            monthDayValue = "31 days";
            break;
        case "february":
            monthDayValue = "28 or 29 days depending on leap year";
            break;
        case "march":
            monthDayValue = "31 days";
            break;
        case "april":
            monthDayValue = "30 days";
            break;
        case "may":
            monthDayValue = "31 days";
            break;
        case "june":
            monthDayValue = "30 days";
            break;
        case "july":
            monthDayValue = "31 days";
            break;
        case "august":
            monthDayValue = "31 days";
            break;
        case "september":
            monthDayValue = "30 days";
            break;
        case "october":
            monthDayValue = "31 days";
            break;
        case "november":
            monthDayValue = "30 days";
            break;
        case "december":
            monthDayValue = "31 days";
            break;
        default:
            monthDayValue = "Invalid input or program error :l";
            return;
    }
    System.out.println(monthDayValue);
}

        } else if (choice == 3) {
            System.out.println(
                    "Input three lengths. We will tell you what type of triangle that is. As a reminder here are some common types of triangles:\n" +
                            "All sides are equal = Equilateral Triangle\n" +
                            "2 Sides are equal = Isosceles Triangle\n" +
                            "No sides are equal = Scalene\n" +
                            "Not a triangle because those sizes wouldn't make a complete triangle\n");

            Integer side1;
            Integer side2;
            Integer side3;
            Integer longest;
            Integer short1;
            Integer short2;
            String type = "";

            System.out.println("Please input a integer for side 1 (ex. 10)");
            side1 = userInput.nextInt();

            System.out.println("Please input a integer for side 2 (ex. 10)");
            side2 = userInput.nextInt();

            System.out.println("Please input a integer for side 3 (ex. 10)");
            side3 = userInput.nextInt();

            if (side1 > side2 && side1 > side3) {
                longest = side1;
                short1 = side2;
                short2 = side3;
            } else if (side2 > side1 && side2 > side3) {
                longest = side2;
                short1 = side1;
                short2 = side3;
            } else if (side3 > side1 && side3 > side2) {
                longest = side3;
                short1 = side1;
                short2 = side2;
            } else {
                longest = side3;
                short1 = side1;
                short2 = side2;
            }
            if ((longest - short1 == 0) && (longest - short2 == 0) && (short1 - longest == 0)) {
                type = "equilateral";
            } else if (longest > (short1 + short2)) {
                type = "terrible";
            } else if (longest == short2) {
                type = "isosceles";
            } else if ((longest != short2) == (short1 != short2)) {
                type = "scalene";
            }

            System.out.println(longest + " " + short1 + " " + short2);

            System.out.println("You have a " + type + " triangle");

        } else if (choice == 4) {

            System.out.println("4. Season from Month and Day\n");
            String monthName;
            Integer monthValue;
            Integer day;

            System.out.println("Please type a month (full spelling of month ex. July): \n");

            monthName = userInput.next();
            monthName = monthName.toLowerCase();

            switch (monthName) {
                case "january":
                    monthValue = 1;
                    break;
                case "february":
                    monthValue = 2;
                    break;
                case "march":
                    monthValue = 3;
                    break;
                case "april":
                    monthValue = 4;
                    break;
                case "may":
                    monthValue = 5;
                    break;
                case "june":
                    monthValue = 6;
                    break;
                case "july":
                    monthValue = 7;
                    break;
                case "august":
                    monthValue = 8;
                    break;
                case "september":
                    monthValue = 9;
                    break;
                case "october":
                    monthValue = 10;
                    break;
                case "november":
                    monthValue = 11;
                    break;
                case "december":
                    monthValue = 12;
                    break;
                default:
                    monthValue = 0;
                    break;
            }

            System.out.println("Please type an integer to represent a day of that month: \n");
            day = userInput.nextInt();

            if (((monthValue > 11) && (day > 20)) || ((monthValue < 4) || ((monthValue == 4))&&(day < 20))) {
                System.out.println("Winter");
            } else if ( ((monthValue < 4) && (day > 19)) || ((monthValue < 7) && (day < 21))  ) {
                System.out.println("Spring");
            } else if ( (((monthValue > 5) && (monthValue < 9)) && (day > 20)) || ((monthValue < 10) && (day < 22))  ) {
                System.out.println("Summer");
            } else if (monthValue == 0) {
                System.out.println("Error :l");
            }
            else {
                System.out.println("Fall");
            }




        } else {
            System.out.println("Program terminated :l");
            break;
        }
        //end of choice if else statement
    }
        //end of endless loop
    }
    //end of method
}
//end of class