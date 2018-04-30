//Your Name: Jacob Duchen
//Today's Date: 4/26/18

/*
  Please comment above each line of code
  saying what you believe that line does.

  This includes any imports.
*/
//importing scanner package
import java.util.Scanner;

//creating class
public class ScannerAverage {

    // public = method availble to other classes,
    // static = no object existing for the class but it is still allowed to be called (need to learn more about this)
   // void = undeterined return value
    // main name of method
    // arguments accepted need to be strings

    //start of method
    public static void main(String[] args) {
        //print
        System.out.println("How many numbers you want to enter?");
        //create instance of Scanner and give it a name of scanner, being pulled from package at top
        Scanner scanner = new Scanner(System.in);
        //instansiating and assigning a variable as the user input from scanner, n will be how long the array will be
        int n = scanner.nextInt();
        //a arrary of doubles (a list of doubles of n many data)
        double[] arr = new double[n];
        //double variable of 0
        double total = 0;
//for loop, for every iteration until less than the length of the array, loop will print element no i + 1: whatever value is
       //because we are zero based, we need to use i + 1

        for(int i=0; i<arr.length; i++){
            System.out.print("Enter Element No."+(i+1)+": ");
            //every time the user inputs a number, we save the value of that number to a new variable
            arr[i] = scanner.nextDouble();
        }
        //close the stream of scanner, i think?
        scanner.close();
        //for loop that iterates through all of our saved number variables, and adds them all together, total is equal to total + new number variable
        for(int i=0; i<arr.length; i++){
            total = total + arr[i];
        }


//double variable average that equals our total  and divides it by the amount of variables we started out with
        double average = total / arr.length;
//print and prints average as a variable not as simple string text
        System.out.format("The average is: %.3f", average);
    }
    //end of method

}
//end of class