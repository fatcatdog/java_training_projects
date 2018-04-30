///        4. Write a Java program that takes the user to provide a single character/        4. Write a Java program that takes the user to provide a single character
//        from the alphabet.Print Vowel or Consonant, depending on the user input.
//        If the user input is a string of length > 1, print an error message.
//
//        Example:
//        Input an alphabet:
//        p
//        Expected Output:Input letter is Consonant

//importing java package
import java.util.Scanner;

//start of class
public class Character {
    //public = open to other classes for usage, static = can be used without having to create instance of class, void=can return any kind of return, main=nameof method, string args = build to take in string args
    public static void main(String[] args) {

        //declaring variables
        boolean isTheLightTurnedOn;
        char myLetter;

        //bringing in package
        Scanner charInput;

        //instructions for user
        System.out.println("Type in your letter:");
        //createing instance of scanner
        charInput = new Scanner(System.in);
        //using scanner
        myLetter = charInput.nextLine().charAt(0);

        // let select the type of letter

     //if input is a vowel message will be returned
        if (myLetter == 'a' || myLetter == 'A' || myLetter == 'e' || myLetter == 'E' || myLetter == 'i'
                || myLetter == 'I' || myLetter == 'o' || myLetter == 'O' || myLetter == 'u' || myLetter == 'U') {
            // we have a vowel
            System.out.println("You have provided a vowel");

        } else
            //if consonant is inputted message will be provided
            System.out.println("You have provided a consonant or another character.");
    }
    //end of method
}
//end of class