//Your Name: Jacob Duchen
//Today's Date: 4/29/18

/*
jump search
*/


import java.util.Scanner;
import java.util.Arrays;

class JumpSearch {
    //we first want linear search, becuase we will linear search each block
    public static int linearSearchMethod(int arr[], int x, int counter) {
        //length of array

        int n = arr.length;
//looping though each, and trying to find target i by one i
        for (int i = 0; i < n; i++) {
            // Return the index of the element if the element
            // is found
            if (arr[i] == x) {
                //we add all the index we already searched to this num from jump search method
                System.out.println((i + counter) + " is the index of where we found that value :l");
                return 1;
            }

        }
        //basically -1 equals false, and we need to return an int
        return -1;
    }

    //jumpsearch time!
    //accepts an array of ints, the size of the block you want to search by, and a target you are looking for
    void jumpSearchMethod(int[] arr, int block, int target) {
        //first index of first block is 0
        int startBlockIndex = 0;
        int counter = 0;

        //based on argument method accepted
        int block_size = block;
//from start to end of array
        while (startBlockIndex < arr.length - 1) {
//copying block
            int[] test_array = Arrays.copyOfRange(arr, startBlockIndex, (startBlockIndex + 4));
//linear search block
            if (linearSearchMethod(test_array, target, counter) == 1) {
                //linearsearch method will return print statement
                //we exit program here
                return;
            }
//if we didnt find target in that block, we can reset block and keep going
            else {
                startBlockIndex += block_size;
                counter += block_size;
            }

        }
        //at the end of while loop, we print not found
        System.out.println("Not found;");
    }


    //actually using the methods and giving it arguments, creating class objects
    public static void main(String args[]) {
        JumpSearch ob = new JumpSearch();
        int arr[] = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        ;
        System.out.println("Out array (0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610) \n");
        System.out.println("Please input a number to check if it is in the array \n");

        Scanner userInput = new Scanner(System.in);
        int target = userInput.nextInt();

        ob.jumpSearchMethod(arr, 4, target);
    }


}
