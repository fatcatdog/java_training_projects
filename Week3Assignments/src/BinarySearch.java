/*
@author = jacob duchen
@data = 5/3/18

binary search exercise
 */

import java.util.Scanner;

//binary search basically seaches half an array at a time, so we use a middle variable that is half of arr.length, and then we either make is bigger or smaller each iteration
class BinarySearch {

    //takes an array and a target value you are looking for
    void binarySearchMethod(int arr[], int targetValue) {
        //assuming array is sorted is part of binary search, so we start with the whole array as high value
        int low = 0;
        int high = arr.length - 1;
//this low will be true until target is found or not found
        while (low <= high) {
//dividing array into 2
            int middle = low + (high - low) / 2;
//searching half of our array
            //if target is less than point in half length of array, we know we should keep searching smaller values, hence, high = middle - 1
            if (targetValue < arr[middle]) {
                high = middle - 1;
            } else if (targetValue > arr[middle]) {
                //if arr middle is greater than target, we know we should search on the other side of the array
                low = middle + 1;
            } else {
                //if middle == target, success statement and end program
                System.out.println(targetValue + " was found at " + middle);
                break;
            }
        }
        //if we fail to find it, we provide this failure statement
        System.out.println("Not found :l");

    }


    public static void main(String args[]) {

        //making object of class
        BinarySearch ob = new BinarySearch();
        //declaring assigning array
        int arr[] = {1, 5, 10, 15, 20, 25, 30, 35, 37, 40, 60, 70, 100};
        System.out.println("Out array {1, 5, 10, 15, 20, 25, 30, 35, 37, 40, 60, 70, 100} \n");
        System.out.println("Please input a number to check if it is in the array \n");

        //getting userinput to provide binarySearch input variables
        Scanner userInput = new Scanner(System.in);
        int ourNum = userInput.nextInt();

        //running program
        ob.binarySearchMethod(arr, ourNum);
    }


}
