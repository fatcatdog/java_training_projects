//Your Name: Jacob Duchen
//Today's Date: 4/26/18

/*
  Please comment above each line of code
  saying what you believe that line does.

  This includes any imports.
*/
//import scanner package
import java.util.Scanner;

//public class started
public class OddOrEven {
    //public = can be seen by other classes
    //static = can be accesed before any object of it is created
    //void = method has no return value
    //main = name of method,
    //string args = can accept string arguments

    //start of method
    public static void main(String args[])
    {
        //declaring variable that is an integer
        int num;

        //printing something
        System.out.println("Enter an Integer number:");
//scanner instance, named input
        Scanner input = new Scanner(System.in);

        //saving input of user as num and it needs to be an integer
        num = input.nextInt();
//if else conditional, if num modulo 2 has a remainder of 0, print even, otherwisee......
        if ( num % 2 == 0 )
            System.out.println("Entered number is even");
        else
            //print odd
            System.out.println("Entered number is odd");
    }
    //end of method
}
//end of class