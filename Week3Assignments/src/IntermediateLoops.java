import java.util.Scanner;

public class IntermediateLoops {
    public static void main(String[] args) {

        for(int RandomEndlessLoop = 1; RandomEndlessLoop < 10;) {

            System.out.println("\n1. The Legendary FizzBuzz\n" +
                    "2. The Halving Machine\n" +
                    "3. Letter at a time\n" +
                    "4. Coordinates in a plane\n" +
                    "\nEnter anything aside from 1-4 to exit\n");

            Scanner userInput = new Scanner(System.in);

            //variable choice will default to 4 if user puts in a non-integer
            Integer choice;
            //program wont break if they input bad number or non-integer
            if (userInput.hasNextInt()) {
                choice = userInput.nextInt();
            } else {
                choice = 5;
            }

            if (choice == 1) {
                System.out.println("1. The Legendary FizzBuzz\n\n");
                System.out.println("Please input a number and we will FizzBuzz it: \n\n");

                Integer inputNumber;

                //program wont break if they input bad number or non-integer
                if (userInput.hasNextInt()) {
                    inputNumber = userInput.nextInt();
                } else {
                    inputNumber = 1;
                }

                for (int i = 1; i <= inputNumber; i++) {
                    if (i % 15 == 0) {
                        System.out.println("FizzBuzz");
                    } else if (i % 5 == 0) {
                        System.out.println("Buzz");
                    } else if (i % 3 == 0) {
                        System.out.println("Fizz");
                    } else {
                        System.out.println(i);
                    }
                }
//end of for loop

            }
            //end of choice 1
            else if (choice == 2) {
                System.out.println("\n2. The Halving Machine\n");

                System.out.println("Please input a number and we has halve it a bunch of times: \n\n");

                Integer inputNumber;

                //program wont break if they input bad number or non-integer
                if (userInput.hasNextInt()) {
                    inputNumber = userInput.nextInt();
                } else {
                    inputNumber = 1;
                }

                Double newNumToCalc = inputNumber * 1.0;

                while (newNumToCalc > 1) {
                    if (newNumToCalc % 2.0 < 1.0) {
                        int num2print = (int) (newNumToCalc / 2.0);
                        if (num2print == 1) {
                            break;
                        }
                        System.out.println(num2print);
                        newNumToCalc = (newNumToCalc / 2.0);
                    } else {
                        int num2print = (int) ((newNumToCalc + 1) / 2.0);
                        System.out.println(num2print);
                        if (num2print == 1) {
                            break;
                        }
                        newNumToCalc = (newNumToCalc / 2.0);
                    }
                }
            }
            //end of choice 2
            else if (choice == 3) {
                System.out.println("3. Letter at a time");
                System.out.println("\nPlease type a string and we will return an array of letters\n");

                System.out.print("Please enter your full name: ");

                String word = userInput.next();
                word += userInput.nextLine();

                for (int i = 0; i < word.length(); i++) {
                    System.out.println(i + ": " + word.charAt(i));
                }

                System.out.println("\n" + word);
            }
            //end of choice 3
            else if (choice == 4) {
                System.out.println("4. Coordinates in a plane\n\n");

                System.out.println("What is the maximum x?\n");

                Integer x_cord = userInput.nextInt();

                System.out.println("What is the maximum y?\n");

                Integer y_cord = userInput.nextInt();

                System.out.println("\nHere are your possible coordinates:\n");

                for (int i = 0; i <= x_cord; i++) {
                    for (int j = 0; j <= y_cord; j++) {
                        System.out.println("(" + i + " , " + j + ")");
                    }
                }

            }
            //end of choice 4
            else if (choice == 5) {
                System.out.println("Program terminated :l");
                break;
            }
            //end of choice 5
        }
        //end of loop
    }
    //end of main
}
//end of class

