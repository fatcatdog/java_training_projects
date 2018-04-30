///        4. Write a Java program that takes the user to provide a single character/        4. Write a Java program that takes the user to provide a single character
//        from the alphabet.Print Vowel or Consonant, depending on the user input.
//        If the user input is a string of length > 1, print an error message.
//
//        Example:
//        Input an alphabet:
//        p
//        Expected Output:Input letter is Consonant

import java.util.Scanner;

public class Character {
    public static void main(String[] args) {

        boolean isTheLightTurnedOn;
        char myLetter;
        Scanner charInput;

        System.out.println("Type in your letter:");
        charInput = new Scanner(System.in);
        myLetter = charInput.nextLine().charAt(0);

        // let select the type of letter

        /* Mu multi-line comment
         * that reads thru
         * many
         * many
         * many
         * lines!!!
         *
         * */
        if (myLetter == 'a' || myLetter == 'A' || myLetter == 'e' || myLetter == 'E' || myLetter == 'i'
                || myLetter == 'I' || myLetter == 'o' || myLetter == 'O' || myLetter == 'u' || myLetter == 'U') {
            // we have a vowel
            System.out.println("You have provided a vowel");

        } else
            // we have a vowel
            System.out.println("You have provided a consonant or another character.");
    }
}