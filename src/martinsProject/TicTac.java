package martinsProject;

import java.util.Arrays;

public class TicTac {

        static String[] board;
        static String turn;
        static String playerNameOne;
        static String playerNameTwo;


    public static String getPlayerNameTwo() {
        return playerNameTwo;
    }

    public static void setPlayerNameTwo(String playerNameTwo) {
        TicTac.playerNameTwo = playerNameTwo;
    }


    public static String getPlayerNameOne() {
        return playerNameOne;
    }

    public static void setPlayerNameOne(String playerName) {
        TicTac.playerNameOne = playerName;
    }

    // CheckWinner method will
        // decide the combination
        // of three box given below.
        static String checkWinner() {
            for (int winLine = 0; winLine < 8; winLine++) {
                String line = null;
                switch (winLine) {
                    case 0:
                        line = board[0] + board[1] + board[2];
                        break;
                    case 1:
                        line = board[3] + board[4] + board[5];
                        break;
                    case 2:
                        line = board[6] + board[7] + board[8];
                        break;
                    case 3:
                        line = board[0] + board[3] + board[6];
                        break;
                    case 4:
                        line = board[1] + board[4] + board[7];
                        break;
                    case 5:
                        line = board[2] + board[5] + board[8];
                        break;
                    case 6:
                        line = board[0] + board[4] + board[8];
                        break;
                    case 7:
                        line = board[2] + board[4] + board[6];
                        break;
                }
                //For X winner
                if (line.equals("XXX")) {
                    return "X";
                }

                // For O winner
                else if (line.equals("OOO")) {
                    return "O";
                }
            }

            for (int win = 0; win < 9; win++) {
                if (Arrays.asList(board).contains(
                        String.valueOf(win + 1))) {
                    break;
                } else if (win == 8) {
                    return "draw";
                }
            }

            // To enter the X Or O at the exact place on board.
            System.out.println(
                    turn + "'s turn; enter a slot number to place "
                            + turn + " in:");
            return null;
        }

        // To print out the board.
	/* |---|---|---|
	| 1 | 2 | 3 |
	|-----------|
	| 4 | 5 | 6 |
	|-----------|
	| 7 | 8 | 9 |
	|---|---|---|*/

        static void printBoard() {
            System.out.println("|---|---|---|");
            System.out.println("| " + board[0] + " | "
                    + board[1] + " | " + board[2]
                    + " |");
            System.out.println("|-----------|");
            System.out.println("| " + board[3] + " | "
                    + board[4] + " | " + board[5]
                    + " |");
            System.out.println("|-----------|");
            System.out.println("| " + board[6] + " | "
                    + board[7] + " | " + board[8]
                    + " |");
            System.out.println("|---|---|---|");
        }
}
