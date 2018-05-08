/*
@author Jacob Duchen
*/

package com.company;
//bringing in packages
import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrays {
//method to sum array

    public static void sumColumn(int[][] array, int input) {
        int answer = array[0][input] + array[1][input] + array[2][input];
        System.out.println("Sum is: " + answer);
    }



    public static void main(String[] args) {
        //using scanner
        Scanner userInput = new Scanner(System.in);

        System.out.println("1. Max Value\n");
//creating a 2d array
        int[][] twoDArray = new int[3][];
        twoDArray[0] = new int[3];
        twoDArray[1] = new int[3];
        twoDArray[2] = new int[3];

        //putting values in that array
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                twoDArray[i][j] = i * j;
            }
        }
        System.out.println("Our 2d Array: ");
        //printing our array
        System.out.println(Arrays.deepToString(twoDArray));
//setting a max value
        int max = 0;
//changing max value if we find a bigger number
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if (max < twoDArray[i][j]) {
                    max = twoDArray[i][j];
                }
            }
        }
        System.out.println("Max is: " + max);

        System.out.println("2. Sum of a column\n");
//creating array
        int[][] newTwoDArray = new int[3][];
        newTwoDArray[0] = new int[3];
        newTwoDArray[1] = new int[3];
        newTwoDArray[2] = new int[3];
//filling it with truly random numbers 1-100
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                newTwoDArray[i][j] =  (int)(Math.random()*99);
            }
        }

        System.out.println("Here is your array");
        System.out.println(Arrays.deepToString(newTwoDArray));
        System.out.println("Enter: 0, 1, or 2, to see the sum of that column: ");
        int columnChoice = userInput.nextInt();
        //using our sumColumn method to get sum of colum values
        sumColumn(newTwoDArray, columnChoice);
    }
}
