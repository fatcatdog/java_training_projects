import java.util.Scanner;

public class MoreLoops {
    public static void main(String[] args) {
        System.out.println("1. Guessing Game\n" +
                "2. Number Puzzle I\n" +
                "3. Number Puzzle II\n" +
                "4. Number Puzzle III\n" +
                "5. Number Puzzle IV\n" +
                "Input an integer of the exercise you want to view: \n" +
                "(Or input a value other than 1-5 to exit)"
        );

        Scanner userInput = new Scanner(System.in);

        //variable choice will default to 4 if user puts in a non-integer
        Integer choice;
        //program wont break if they input bad number or non-integer
        if (userInput.hasNextInt()) {
            choice = userInput.nextInt();
        } else {
            choice = 6;
        }
        if (choice == 1) {
            System.out.println("1. Guessing Game\n");

            Integer guessedNumber;
            Integer tries = 8;
            int random = (int) (Math.random() * 100 + 1);

            for (int RandomEndlessLoop = 1; RandomEndlessLoop < 10; ) {

                System.out.println("Guess a number between 1-100 to match my random number generator, you have " + tries + " left: \n\n");


                //program wont break if they input bad number or non-integer
                if (userInput.hasNextInt()) {
                    guessedNumber = userInput.nextInt();
                } else {
                    guessedNumber = -1;
                }

                if (guessedNumber == random) {
                    tries--;
                    System.out.println("Yup! the correct answer was " + guessedNumber + ". That took you  " + (8 - tries) + " attempts.");
                    break;
                } else if (guessedNumber > random) {
                    tries--;
                    System.out.println("TOO HIGH! Your guess was too high!");
                } else if (guessedNumber < random) {
                    tries--;
                    System.out.println("TOO LOW!Your guess was too low!");
                }

                if (tries < 0) {
                    System.out.println("You failed!!!!");
                    break;
                }

            }
//end of loop
        }
//end of choice one
        else if (choice == 2) {
            System.out.println("2. Number Puzzle I\n");

            int[][] arrayOfMatches = new int[10][2];
            int arrayIndex = 0;
            for (int i = 10; i < 60; i++) {
                for (int j = 60; j > 9; j--) {
                    if ((i + j == 60) && (Math.abs(i - j) == 14)) {
                        arrayOfMatches[arrayIndex][0] = i;
                        arrayOfMatches[arrayIndex][1] = j;
                        System.out.println(arrayOfMatches[arrayIndex][0] + " , " + arrayOfMatches[arrayIndex][1]);
                        arrayIndex++;
                    }
                }
            }

        } else if (choice == 3) {
            System.out.println("3. Number Puzzle II\n");

            for (int i = 1; i <= 99; i++) {
                int tensI = i / 10;
                int onesI = i % 10;


                if (tensI + onesI > 10) {
                    System.out.println(i);
                }
            }
//end of for loop
        }
//end of choice 3

        else if (choice == 4) {
            System.out.println("4. Number Puzzle III\n");

            for (int i = 100; i <= 999; i++) {
                int hundredsI = (i / 100);
                int tensI = ((i % 100) / 10);
                int onesI = (i % 10);

//check if there all Armstrong numbers
                if ((Math.pow(hundredsI, 3) + Math.pow(tensI, 3) + Math.pow(onesI, 3)) == i) {
                    System.out.println(i);
                }
            }
            //end of for loop
        }
//end of choice 4

        else if (choice == 5) {
            System.out.println("5. Number Puzzle IV\n");

//            for (int a = 1; a < 20; a++) {
//                for (int b = 1; b < 20; b++) {
//                    for (int c = 1; c < 20; c++) {
//                        for (int d = 1; d < 20; d++) {
//                            if ((a + b + c + d) == 45) {
//                                if (((a + 2) == (b - 2)) && ((b - 2) == (c * 2)) && (c*2 == (int)(d/2.0))) {
//                                    System.out.println(a + ", " + b + ", " + c + ", " + d);
//                                }
//                            }
//                        }
//                    }
//                }
//            }
        }
        //end of choice 5
    }
    //end of method
}
//end of class