//Your Name: Jacob Duchen
//Today's Date: 4/29/18

/*
selection sort sorts arrays by repeatedly looking for min value, and placeing it at the start of array (changing start of subarray each time)
*/


class SelectionSort {
    void sort(int arr[]) {
        //total length of array
        int n = arr.length;

        // One by one move boundary of unsorted subarray in this for loop

        for (int i = 0; i < n - 1; i++) {
            //minIndex placeholder based on i
            int minIdx = i;
//looping though to find smallest value
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
//and exchanging values
                int temp = arr[minIdx];
                arr[minIdx] = arr[i];
                arr[i] = temp;
            }
        }

    }

    //reversing the conditionals, but same meat and potatoes as un-reversed sort
    void reverseSort(int arr[]) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray

        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }

                int temp = arr[maxIdx];
                arr[maxIdx] = arr[i];
                arr[i] = temp;
            }
        }

    }

    // Prints the array
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver code to test above
    public static void main(String args[]) {
        SelectionSort ob = new SelectionSort();
        int arr[] = {64, 25, 12, 22, 11};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);

        ob.reverseSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}