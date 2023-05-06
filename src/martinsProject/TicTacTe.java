package martinsProject;

import java.util.InputMismatchException;
import java.util.Scanner;

import static martinsProject.TicTac.*;

public class TicTacTe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        board = new String[9];
        turn = "X";
        String winner = null;
        System.out.println("[FIRST PLAYER]Enter your your name:");
        String firstPlayer = in.nextLine();
        setPlayerNameOne(firstPlayer);
        System.out.println("[SECOND PLAYER]Enter your your name:");
        String secondPlayer = in.nextLine();
        setPlayerNameTwo(secondPlayer);

        for (int a = 0; a < 9; a++) {
            board[a] = String.valueOf(a + 1);
        }

        System.out.println("Welcome to 3x3 Tic Tac Toe.");
        printBoard();

        System.out.printf("%s will play first. Enter a slot number to place X in: ",
                getPlayerNameOne());

        while (winner == null) {
            int numInput;

            // Exception handling.
            // numInput will take input from user like from 1 to 9.
            // If it is not in range from 1 to 9.
            // then it will show you an error "Invalid input."
            try {
                numInput = in.nextInt();
                if (!(numInput > 0 && numInput <= 9)) {
                    System.out.println(
                            "Invalid input; re-enter slot number:");
                    continue;
                }
            }
            catch (InputMismatchException e) {
                System.out.println(
                        "Invalid input; re-enter slot number:");
                continue;
            }

            // This game has two player x and O.
            // Here is the logic to decide the turn.
            if (board[numInput - 1].equals(
                    String.valueOf(numInput))) {
                board[numInput - 1] = turn;

                if (turn.equals("X")) {
                    turn = "O";
                }
                else {
                    turn = "X";
                }

                printBoard();
                winner = checkWinner();
            }
            else {
                System.out.println(
                        "Slot already taken; re-enter slot number:");
            }
        }

        // If no one win or lose from both player x and O.
        // then here is the logic to print "draw".
        if (winner.equalsIgnoreCase("draw")) {
            System.out.println(
                    "It's a draw! Thanks for playing.");
        }

        // For winner -to display Congratulations! message.
        else if (winner.equals(getPlayerNameOne())){
            System.out.println(
                    "Congratulations! " + winner
                            + "'s have won! Thanks for playing.");
        }else winner.equals(getPlayerNameTwo());
            System.out.println(
                    "Congratulations! " + winner
                            + "'s have won! Thanks for playing.");

        in.close();
    }
}

