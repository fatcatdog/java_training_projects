package com.company;

import java.util.Scanner;

public class Assignment4MoreLoops {
Scanner userInput = new Scanner(System.in);

    void guessingGame() {
        int guess = 0;
        int random_number;
        int counter = 0;
        random_number = (int)(Math.random() * ( 100 - 1 ));
        System.out.println("Our random number is: ");
        System.out.println(random_number);

        while((guess != random_number) && (counter < 8)) {
            System.out.println("Please guess a random number between 1-100");
            guess = userInput.nextInt();
            counter++;
            if (guess < random_number) {
                System.out.println("Our number is bigger than your guess");
            } else if (guess > random_number) {
                System.out.println("Our number is smaller than your guess");
            } else if (guess == random_number) {
                System.out.println("Correct!!! the number was " + random_number);
            } else {
                System.out.println("You ran out of tries!");
            }
        }
    }


    void numberPuzzleI() {
        int[] possibleNumbers = new int[90];
        for(int i = 10; i <= 99; i++) {
            possibleNumbers[i - 10] = i;
        }

        for(int i = 0; i <= possibleNumbers.length - 1; i++) {
        for(int j = 0; j <= possibleNumbers.length - 1; j++) {
            if ((possibleNumbers[i] + possibleNumbers[j] == 60)&& (Math.abs(possibleNumbers[i] - possibleNumbers[j]) == 14 )) {
                System.out.println(possibleNumbers[i] + ", " +  possibleNumbers[j]);
                possibleNumbers[i] = 0;
                possibleNumbers[j] = 0;
            }
        }
        }
    }

    void numberPuzzleII() {
        int[] possibleNumbers = new int[47];
        for(int i = 10; i <= 56; i++) {
            possibleNumbers[i - 10] = i;
        }

        for(int i = 0; i <= 46; i++) {

            int first = (possibleNumbers[i] / 10);
            int second = (possibleNumbers[i] % 10);

            if ((first + second) > 10) {
                System.out.println(possibleNumbers[i]);
            }
        }
    }

    void numberPuzzleIII() {
        int[] possibleNumbers = new int[900];
        for(int i = 100; i < 1000; i++) {
            possibleNumbers[i - 100] = i;
        }

        for(int i = 0; i < possibleNumbers.length; i++) {

            int first = (possibleNumbers[i] / 100);
            int second = ((possibleNumbers[i] % 100) / 10);
            int third = (possibleNumbers[i] % 10);

            if (((first * first * first) + (second * second * second) + (third * third * third)) == possibleNumbers[i]) {
                System.out.println(possibleNumbers[i]);
            }
        }
    }

    void numberPuzzleIV() {
        int[] possibleNumbers = new int[45];

        for(int i = 1; i < 46; i++) {
            possibleNumbers[i - 1] = i;
        }

        for(int i = 0; i < possibleNumbers.length; i++) {
            for (int j = 0; j < possibleNumbers.length; j++) {
                for (int k = 0; k < possibleNumbers.length; k++) {
                    for (int l = 0; l < possibleNumbers.length; l++) {
                        if ((possibleNumbers[i] + possibleNumbers[j] + possibleNumbers[k] + possibleNumbers[l]) == 45) {
                            if (((possibleNumbers[i] + 2) == (possibleNumbers[l] / 2)) && ((possibleNumbers[j] - 2) == possibleNumbers[l] / 2) && ((possibleNumbers[k] * 2) == possibleNumbers[l] / 2)) {
                                System.out.println(possibleNumbers[i] + " " + possibleNumbers[j] + " " + possibleNumbers[k] + " " + possibleNumbers[l]);
                            }
                        }
                    }
                }
            }
        }






        }





        public static void main(String[] args) {
        Assignment4MoreLoops test = new Assignment4MoreLoops();
//        test.guessingGame();
//        test.numberPuzzleI();
//        test.numberPuzzleIII();
        test.numberPuzzleIV();

    }


}
