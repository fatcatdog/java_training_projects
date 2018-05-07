
//Your Name: Jacob Duchen
//Today's Date: 4/29/18

/*
bubble sort checks two data from an array at a time, if the data closer to end of array is smaller than first data, we swithc values and loop down to end of array
*/

class BubbleSort {
    void bubbleSort(int arr[]) {
        //knowing where the end of the array is with this assinged variable
        int n = arr.length;
        int counter = 0;

        //for each data in this array up until last spot in array we will iterate
        for (int i = 0; i < n - 1; i++) {
            //double for loop, so we can check 2 numbers at a time, to see if its more or less than
            for (int j = 0; j < n - i - 1; j++) {
                //checking relative values here
                if (arr[j] > arr[j + 1]) {
                    //saving arrj
                    int temp = arr[j];
                    counter++;
                    System.out.println(counter);
                    //switching values if its > then
                    arr[j] = arr[j + 1];
                    //not forgatting
                    arr[j + 1] = temp;
                }
            }
        }

    }

    //reversse of bubble sort ><, so in this one, we simply check if arrj < arrj +1, and then switch values each iteration if thats true
    void reversebubbleSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    /* Prints the array */
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver method to test above
    //
    public static void main(String args[]) {
        //new object of class
        BubbleSort ob = new BubbleSort();
//declaring array to test
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        //running bubble sort
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
//running reverse bubblesort
        ob.reversebubbleSort(arr);
        System.out.println("Reversed sorted array");
        ob.printArray(arr);

    }
}