//Your Name: Jacob Duchen
//Today's Date: 4/29/18

/*
linear search
*/
//bringing in scanner

import java.util.Scanner;

//class name
class LinearSearch {
    // This function returns index of element x in arr[]
    //takes an array and a target
    void linearSearchMethod(int arr[], int x) {
        //array length
        int n = arr.length;
//looping from 0 to array length
        for (int i = 0; i < n; i++) {
            // Return the index of the element if the element
            // is found
            if (arr[i] == x) {
                System.out.println(i + " is the index of where we found that value :l");
                return;
            }

        }
//if loop didnt terminate program with return, we will print this stuff
        System.out.println("Nope wasnt in there");
    }

    //creating an object, an array, userinput takes target, and we linear search it!
    public static void main(String args[]) {
        LinearSearch ob = new LinearSearch();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Out array {64, 34, 25, 12, 22, 11, 90} \n");
        System.out.println("Please input a number to check if it is in the array \n");

        Scanner userInput = new Scanner(System.in);
        int ourNum = userInput.nextInt();

        ob.linearSearchMethod(arr, ourNum);
    }
}


