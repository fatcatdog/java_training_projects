/*
@author Jacob Duchen
*/

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

    public static void main(String[] args) {

        System.out.println("1. Starting Small\n" +
                "\n2. Updating" +
                "\n3. Removing" +
                "\n4. Searching" +
                "\n5. Sorting" +
                "\n6. Reversing" +
                "\n7. Copying");

        System.out.println("1. Starting Small\n");

        ArrayList<String> stringArrayList = new ArrayList<String>(5);
        stringArrayList.add("red");
        stringArrayList.add("green");
        stringArrayList.add("orange");
        stringArrayList.add("purple");
        stringArrayList.add("brown");

        System.out.println(stringArrayList);

        System.out.println("2. Updating\n");

        stringArrayList.set(4, "magenta");
        System.out.println(stringArrayList);

        System.out.println("\n3. Removing");

        stringArrayList.remove(3);
        System.out.println(stringArrayList);

        System.out.println("\n4. Searching");

        for(int i = 0; i < 4; i++){
            if(stringArrayList.get(i) == "red") {
                System.out.println("stringArrayList includes purple at index " + i);
            }
        }

        System.out.println("\n5. Sorting");
        System.out.println("Unsorted ArrayList");
        System.out.println(stringArrayList);
        Collections.sort(stringArrayList);
        System.out.println("Sorted ArrayList");
        System.out.println(stringArrayList);

        System.out.println("6. Reversing\n");
        System.out.println("Unreversed");
        System.out.println(stringArrayList);
        System.out.println("Reversed");
        Collections.reverse(stringArrayList);
        System.out.println(stringArrayList);

        System.out.println("7. Copying\n");
        ArrayList<String> newList = new ArrayList<>(stringArrayList);
        System.out.println("Our new Copy\n");
        System.out.println(newList);
    }
}
