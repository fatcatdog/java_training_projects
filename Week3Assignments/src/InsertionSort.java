//Your Name: Jacob Duchen
//Today's Date: 4/29/18

/*
insertion sort builds array one piece at a time, linear searching each iteration
*/


class InsertionSort
{
    /*Function to sort array using insertion sort*/
    void sort(int arr[])
    {
        //array length
        int n = arr.length;
//looping through each part of array
        for(int i = 1; i < n; i++) {
//getting first and second variable
            int key = arr[i];
            int j = i - 1;
//looping through array, conditions are if as long as we have valid j position, and if prev data is greater than key, we need to basically place that j somewhere at the end of the array, so we will loop if that is true
            while (j>=0 && arr[j] > key)
            {
                //switching values
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;

        }


    }
//reverseing insertion sort
    void reverseSort(int arr[])
    {
        int n = arr.length;
//same thing, but all of our conditions are reversed
        for(int i = n - 1; i > -1; i--) {
            int currentIdx = i;
            int prevIdx = i - 1;

            while ((prevIdx > -1) && (arr[currentIdx] > arr[prevIdx])) {
                int temp = arr[prevIdx];
                arr[prevIdx] = arr[currentIdx];
                arr[currentIdx] = temp;
                prevIdx--;
            }

        }


    }

    /* A utility function to print array of size n*/
    static void printArray(int arr[])
    {
        int n = arr.length;

        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver method
    public static void main(String args[])
    {
        System.out.println("Original: {12, 11, 13, 5, 6}");

        int arr[] = {12, 11, 13, 5, 6};

        InsertionSort ob = new InsertionSort();
        System.out.println("Sorted array");
        ob.sort(arr);
        printArray(arr);

        System.out.println("Original: {50, 14, 11, 222, 33}");

        int newaArr[] = {50, 14, 11, 222, 33};

        System.out.println("Reverse sorted array");
        ob.reverseSort(newaArr);
        printArray(newaArr);

    }
} 