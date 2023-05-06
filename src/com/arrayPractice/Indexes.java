package com.arrayPractice;

import java.util.Scanner;

public class Indexes {
    private static int[] myList = new int[10];
    public static void intializingArrayWithLoops(int[] myList){
        for (int i = 0; i < myList.length; i++) {
            myList[i] = i + 24;
            System.out.println(myList[i]+" ");
        }
    }
    public static void initializingArrayWithLoopsAndScanner(){
//        int[] myList;
        Scanner input = new Scanner(System.in);
        System.out.println("enter "+myList.length+ "values");
        for (int i = 0; i < myList.length; i++) {
            myList[i] = input.nextInt();
        }
//        for (int list: myList) {
//            System.out.println(list);
//        }
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i]+", ");
        }
    }

    public static void initializingArrayWithRandom() {
        int print;
        for (print = 0; print < myList.length; print++) {
            myList[print] = (int) (Math.random() * 100 + 23 / 90);
        }
    }

    public static void main(String[] args) {
//        intializingArrayWithLoops();
//        initializingArrayWithLoopsAndScanner();
        initializingArrayWithRandom();
    }
}
