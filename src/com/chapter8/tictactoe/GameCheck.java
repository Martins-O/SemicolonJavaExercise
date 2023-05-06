package com.chapter8.tictactoe;

public class GameCheck {

    public boolean isValid(int row, int column, char[][] board){
        if(row >= 0 && row < board.length && column >= 0 && column < board.length){
            if (board[row][column] == '_' || board[row][column] == ' '){
                return true;
            }
        }
        return false;
    }

    public boolean rowVictory(char letter, char[][] board){
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == letter && board[row][1] == letter && board[row][2] == letter){
                return true;
            }
        }
        return false;
    }

    public boolean columnVictory(char letter, char[][] board){
        for (int column = 0; column < board.length; column++) {
            if (board[0][column] == letter && board[1][column] == letter && board[2][column] == letter){
                return true;
            }
        }
        return false;
    }

    public boolean diagonalVictory(char letter, char[][] board){
        if (board[1][1] != letter){
            return false;
        }
        if (board[0][0] == letter && board[2][2] == letter){
            return true;
        }
        if (board[0][2] == letter && board[2][0] == letter){
            return true;
        }
        return false;
    }
}
