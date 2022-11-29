package com.chapter8.tictactoe;

import java.util.Scanner;

public class TicTacToe {

    private static final char[][] board = {{'_','_','_'},{'_','_','_'},{' ',' ',' '}};
    private boolean gameDone = false;
    private char player;
    GameCheck gameCheck = new GameCheck();

    public void startGame(){
        Scanner input = new Scanner(System.in);
        player = 'X';
        while (!gameDone){
            displayBoard();
            System.out.println("enter for row and column(0-2): ");
            if(player == 'X' && !gameOver('0', board)) {
                int row = input.nextInt();
                int column = input.nextInt();
                makeMove(row, column );
            }
            if(player == '0' && !gameOver('0', board)){
                computerMove();
            }
        }
        displayBoard();
        System.out.println("Game over!");
    }

    public static void displayBoard(){
        for (char[] chars : board) {
            for (int column = 0; column < chars.length; column++) {
                System.out.print(chars[column]);
                if (column < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
    }

    public void makeMove(int row, int column){
        if (gameCheck.isValid(row, column, board)){
            board[row][column] = 'X';
        }
        else {
            System.out.println("Not valid space!");
        }
    }

    public void computerMove(){
        Move compMove = getComputerMove();
        board[compMove.getRow()][compMove.getColumn()] = 'O';
    }

    public Move getComputerMove(){
        while(true){
            int row = (int)(Math.random() * 3);
            int column = (int)(Math.random() * 3);
            if (gameCheck.isValid(row, column, board)){
                return new Move(row,column);
            }
        }
    }

    public boolean checkVictory(char letter, char[][] board){
        if (gameCheck.rowVictory(letter, board) || gameCheck.columnVictory(letter, board) ||
                gameCheck.diagonalVictory(letter, board)){
            return true;
        }
        return false;
    }

    public boolean boardFull(){
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board.length; column++) {
                if (board[row][column] =='_' || board[row][column] == ' '){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean gameOver(char letter, char[][] board){
        if (checkVictory(letter, board)){
            gameDone = true;
            return true;
        }
        if (boardFull()){
            gameDone = true;
            return true;
        }
            return false;
    }

    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        displayBoard();
        ticTacToe.makeMove(2,2);
        ticTacToe.computerMove();
        ticTacToe.makeMove(2,3);
        ticTacToe.computerMove();
        ticTacToe.makeMove(1,3);
        ticTacToe.computerMove();
        displayBoard();

    }
}
