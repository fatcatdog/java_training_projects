//Your Name: Jacob Duchen
//Today's Date: 4/26/18

/*
  Please comment above each line of code
  saying what you believe that line does.

  This includes any imports.
*/


//importing scanner package
import java.util.Scanner;

//starting public class
public class Multiplication {

    //starting method
    //public = method allowed to be used by other classes
    //void = returns an undetermined variable type
    // static = no object existing for the class but it is still allowed to be called (need to learn more about this)
    //main = name of method
    //is allowed to take arguements of string type
    public static void main(String[] args) {
        //use scanned package and open an instance of it and names it scan
        Scanner scan = new Scanner(System.in);
        //print
        System.out.print("Enter first number: ");
        //saving user input as num1 (has to be an integer or things will break)
        int num1 = scan.nextInt();
        //printing something
        System.out.print("Enter second number: ");
        //saving user input as num2 (has to be an integer or things will break)
        int num2 = scan.nextInt();
        //closing scan stream?
        scan.close();
        //saving product as product of two variables
        int product = num1*num2;
//print somthing out + product is not simple text its an integer value
        System.out.println("Output: "+product);
    }
    //ended method
}
//ended class