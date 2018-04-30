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
public class ScannerExercises {
    public static void main(String[] args) {
//declaring variables for asking questions (and Age in Five Years)
        String name;
        Integer age;
        Double wage;

        //declaring variables for data mining (and Age in Five Years)

        String fname;
        String lname;
        Integer grade;
        Integer id;
        String login;
        Double gpa;

        //declaring variables for dumb calcultor

        Double firstNum;
        Double secondNum;
        Double thirdNum;

        //declaring variables for bmi calculator

        Double height;
        Double weight;

        //choice variable declaration
        Integer choice;

        //loop to allow user to explore all sections of program without having to rerun it
        for (Double j = 1.0; j <= 10; ) {

            System.out.println("\nPress 1 for Asking Questions\nPress 2 for Data Mining\nPress 3 for Age in Five Years\nPress 4 for The Dumb Calculator\nPress 5 for A Simple BMI Calculator\nEnter anything else to exit program :)");

            Scanner input = new Scanner(System.in);
            //if the input is an integer, we can set choice, otherwise....
            if (input.hasNextInt()) {
                choice = input.nextInt();
            } else {
                choice = 4977;
            }

//choice variable is set, so this logic will show section of program user what they choose
            if (choice == 1) {
                System.out.println("\nAsking Questions\n");
                System.out.println("\nHello. What's your name?\n");
                name = input.next();
                System.out.println(name);
                System.out.println("\nHi " + name + "! How old are you?\n\n");
                age = input.nextInt();
                System.out.println("\nSo you're " + age + ", eh? That's not old at all!\n" +
                        "How much do you make, " + name + "?\n");
                wage = input.nextDouble();
                System.out.println(wage + "! I hope that's per hour and not per year!");
            } else if (choice == 2) {
                System.out.println("\nData Mining\n");
                System.out.println("\nPlease enter the following information so I can sell it for a profit!\n");
                System.out.println("First Name please");
                fname = input.next();
                System.out.println("Last Name please");
                lname = input.next();
                System.out.println("Grade (9-12) as an int please");
                grade = input.nextInt();
                System.out.println("Student ID as an int please");
                id = input.nextInt();
                System.out.println("Login please");
                login = input.next();
                System.out.println("GPA (0.0-4.0) please");
                gpa = input.nextDouble();
                System.out.println(
                        "Your Information: "
                                + "\nLogin: " + login
                                + "\nID: " + id
                                + "\nName: " + lname + ", " + fname
                                + "\nGPA: " + gpa
                                + "\nGrade: " + grade
                );
            } else if (choice == 3) {
                System.out.println("\nAge in Five Years\n");
                System.out.println("\nHello. What's your name?\n");
                name = input.next();
                System.out.println("\nHi " + name + "! My name is Java. Nice to meet you.\n\n");
                System.out.println("\nHow old are you?\n");
                age = input.nextInt();
                System.out.println("Did you know that in five years you will be " + (age + 5) + " years old?");
                System.out.println("And five years ago you were " + (age - 5) + "! Imagine that!");
            } else if (choice == 4) {
                System.out.println("\nDumb Calculator time!\n");
                System.out.println("\nWhat is your first number?\n");
                firstNum = input.nextDouble();
                System.out.println("\nWhat is your second number?\n");
                secondNum = input.nextDouble();
                System.out.println("\nWhat is your third number?\n");
                thirdNum = input.nextDouble();
                System.out.println(firstNum + " + " + secondNum + " + " + thirdNum + " / 2 = " + ((firstNum + secondNum + thirdNum) / 2) + "!");
            } else if (choice == 5) {
                System.out.println("\nA Simple BMI Calculator\n");

                System.out.println("\nYour height in m: \n");
                height = input.nextDouble();
                System.out.println("\nYour weight in kg: \n");
                weight = input.nextDouble();
                System.out.println("\nYour BMI is " + (weight / (height * height)));
            } else {
                //exiting loop of program logic
                System.out.println("\nThanks for stopping by!\n");
                break;
            }

        }
    }
}