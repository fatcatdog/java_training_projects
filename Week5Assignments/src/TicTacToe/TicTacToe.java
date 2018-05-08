/*
@author Jacob Duchen
*/

package TicTacToe;

import java.util.Scanner;

public class TicTacToe {
//declaring variables
    boolean gameover;
    boolean draw;
    String turn;
    String winner;

//this constructor gives game these values
    public TicTacToe() {
        this.gameover = false;
        this.draw = false;
        this.turn = "X";
        this.winner = "The Board Wins Again!";
    }
//every turn, almost all logic is in here, if turn is successful, turn(the active player) changes

    public void makeTurn(int desiredPosition, Board board) {
        if ((board.positions[(desiredPosition - 1)] != "X") && (board.positions[(desiredPosition - 1)] != ("0"))) {
            board.positions[(desiredPosition - 1)] = turn;
            if (turn == "X") {
                turn = "0";
            } else {
                turn = "X";
            }
        } else {
            System.out.println("Invalid turn :l");
            turn = turn;
        }
    }

    //check if the move ended the game, we dont want to keep playing if game is over!

    public void checkIfGameOver(String[] positions) {
        for (int a = 0; a < 8; a++) {
            String line = null;
//these are all combinations of winning positions
            switch (a) {
                case 0:
                    line = positions[0] + positions[1] + positions[2];
                    break;
                case 1:
                    line = positions[3] + positions[4] + positions[5];
                    break;
                case 2:
                    line = positions[6] + positions[7] + positions[8];
                    break;
                case 3:
                    line = positions[0] + positions[3] + positions[6];
                    break;
                case 4:
                    line = positions[1] + positions[4] + positions[7];
                    break;
                case 5:
                    line = positions[2] + positions[5] + positions[8];
                    break;
                case 6:
                    line = positions[0] + positions[4] + positions[8];
                    break;
                case 7:
                    line = positions[2] + positions[4] + positions[6];
                    break;
            }
//if any winning position is complete, someone won!
            if (line.equals("XXX")) {
                System.out.println("The Winner is X!");
                winner = "X";
            } else if (line.equals("OOO")) {
                System.out.println("The Winner is 0!");
                winner = "0";
            }
    }
}

//printing board
    public void printBoard(String[] positions) {
        System.out.println("/---|---|---\\");
        System.out.println("| " + positions[0] + " | " + positions[1] + " | " + positions[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + positions[3] + " | " + positions[4] + " | " + positions[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + positions[6] + " | " + positions[7] + " | " + positions[8] + " |");
        System.out.println("/---|---|---\\");
    }

    public static void main(String[] args) {
        //if counter is 9, board is full game over!
        int counter = 0;
        //creating a new board
        Board ourBoard = new Board();
        //starting a new game
        TicTacToe currentGame = new TicTacToe();
        //passing printboard apporpirate arguments and an object of current game
        currentGame.printBoard(ourBoard.positions);
        //bringing in scanner
        Scanner userInput = new Scanner(System.in);
        //game actually gets played here

        while ((currentGame.winner == "The Board Wins Again!") && (counter < 9)) {
            System.out.println(currentGame.turn + " it's your turn :)");
            System.out.println("Please choose a tile to play: (i.e. 1-9)");
            //getting user to input position
            int desiredPosition = userInput.nextInt();
            //attempt to make turn if its a valid move etc.
            currentGame.makeTurn(desiredPosition, ourBoard);
            //print board
            currentGame.printBoard(ourBoard.positions);
            //check if game is over every turn
            currentGame.checkIfGameOver(ourBoard.positions);
            //incrementing counter to make sure board is not full
            counter++;
        }
        //if counter is 9, game over!
        if (counter > 8) {
            System.out.println("Draw! Board Wins");
        }
    }

    }
