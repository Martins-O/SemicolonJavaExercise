package com.twoDimensionalArray.practice;


import java.util.Arrays;

public class Declaring {
    public static void main(String[] args) {
        int[][] myArray;
        myArray = new int[5][5];
        myArray[2][1] = 7;
        System.out.println(Arrays.toString(myArray));

        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}};
    }
}
