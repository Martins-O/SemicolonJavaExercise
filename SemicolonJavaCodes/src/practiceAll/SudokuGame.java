package practiceAll;

public class SudokuGame {
    void sudoku(int[][] myGame){
        int value;
        for (int row = 0; row < myGame.length; row++) {
            for (int column = 0; column < myGame[row].length; column++) {
                value = column + row + 1;
//                myGame[row][column] = value ? value % 10 == 0 : value;
            }
        }
    }
//    int printBoard(int[][] myGame){
//        for (int[] game: myGame);
//        return game;
//    }
}
