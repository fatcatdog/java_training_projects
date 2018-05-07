package TicTacToe;

import java.util.Scanner;

public class TicTacToe {

    boolean gameover;
    boolean draw;
    String turn;
    String winner;

    public TicTacToe() {
        this.gameover = false;
        this.draw = false;
        this.turn = "X";
        this.winner = "The Board Wins Again!";
    }

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

    public void checkIfGameOver(String[] positions) {
        for (int a = 0; a < 8; a++) {
            String line = null;
//            String[] arrayBoard = board.pos
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

            if (line.equals("XXX")) {
                System.out.println("The Winner is X!");
                winner = "X";
            } else if (line.equals("OOO")) {
                System.out.println("The Winner is 0!");
                winner = "0";
            }
    }
}


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
        int counter = 0;
        Board ourBoard = new Board();
        TicTacToe currentGame = new TicTacToe();
        currentGame.printBoard(ourBoard.positions);

        Scanner userInput = new Scanner(System.in);

        System.out.println("X goes first!");
        while ((currentGame.winner == "The Board Wins Again!") && (counter < 9)) {
            System.out.println(currentGame.turn + " it's your turn :)");
            System.out.println("Please choose a tile to play: (i.e. 1-9)");
            int desiredPosition = userInput.nextInt();
            currentGame.makeTurn(desiredPosition, ourBoard);
            currentGame.printBoard(ourBoard.positions);
            currentGame.checkIfGameOver(ourBoard.positions);
            counter++;
        }
        if (counter > 8) {
            System.out.println("Draw! Board Wins");
        }
    }

    }
