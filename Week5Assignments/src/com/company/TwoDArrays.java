package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrays {

    public static void sumColumn(int[][] arrayThing, int input) {
        int answer = arrayThing[0][input] + arrayThing[1][input] + arrayThing[2][input];
        System.out.println("Sum is: " + answer);
    }



    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("1. Max Value\n");

        int[][] twoDArray = new int[3][];
        twoDArray[0] = new int[3];
        twoDArray[1] = new int[3];
        twoDArray[2] = new int[3];

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                twoDArray[i][j] = i * j;
            }
        }
        System.out.println("Our 2d Array: ");
        System.out.println(Arrays.deepToString(twoDArray));

        int max = 0;

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if (max < twoDArray[i][j]) {
                    max = twoDArray[i][j];
                }
            }
        }
        System.out.println("Max is: " + max);

        System.out.println("2. Sum of a column\n");

        int[][] newTwoDArray = new int[3][];
        newTwoDArray[0] = new int[3];
        newTwoDArray[1] = new int[3];
        newTwoDArray[2] = new int[3];

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                newTwoDArray[i][j] =  (int)(Math.random()*99);
            }
        }
        System.out.println("Here is your array");
        System.out.println(Arrays.deepToString(newTwoDArray));
        System.out.println("Enter: 0, 1, or 2, to see the sum of that column: ");
        int columnChoice = userInput.nextInt();
        sumColumn(newTwoDArray, columnChoice);
    }
}
