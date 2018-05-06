import java.util.Scanner;

public class StringToInt {
    public static int cardNumber = 0;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please, insert the card name: ");
        String cardName = in.next();

        if (cardName.equalsIgnoreCase("Hearts") || cardName.equalsIgnoreCase("Clubs") ||
                cardName.equalsIgnoreCase("Spades") || cardName.equalsIgnoreCase("Diamonds")
                ) {
            //System.out.println("Try again\n");
            System.out.println("The number of the card is: " + switchCase(cardName) + "\n");
        } else {
            System.out.println("Try again\n");
        }
    }


    public static int switchCase(String cardName) {

        // Variable declaration

        if (cardName.equalsIgnoreCase("Hearts") || cardName.equalsIgnoreCase("Clubs") ||
                cardName.equalsIgnoreCase("Spades") || cardName.equalsIgnoreCase("Diamonds")
                ) {

            switch (cardName) {
                case "Hearts":
                    cardNumber = 0;
                    break;
                case "Clubs":
                    cardNumber = 1;
                    break;
                case "Spades":
                    cardNumber = 2;
                    break;
                case "Diamonds":
                    cardNumber = 3;
                    break;

                default:
                    cardNumber = 0;
                    break;
            }
        }  //end of the Switch statement
        else {
            System.out.println("invalid input");
        }  //end of if..else statement

        return cardNumber;
    }  // end of method switchCase
}