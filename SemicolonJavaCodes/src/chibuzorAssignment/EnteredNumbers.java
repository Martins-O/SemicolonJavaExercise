package chibuzorAssignment;


import java.util.Scanner;

public class EnteredNumbers {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
      //  System.out.println("Enter the number: ");
        int base;
        int power;
        int result =1;

        System.out.print("Enter the number: ");
        base = num.nextInt();

        System.out.print("Enter the number: ");
        power = num.nextInt();

        for (int i = 0; i < power; i++) {

            result *= base;
        }
        System.out.println("Result: "+ result);
//        int num1 = num.nextInt();
//
//        System.out.println("Enter the number: ");
//        int num2 = num.nextInt();
//
//        int power = 1;
//        while (power != 0){
//            num1 = num1 * num2;
//            power--;
//        }
//
//
////
////        if(num2 >= 1) {
////            for (int i = 1; i < num2; i++) {
////                power = power * num1;
////            }
//            System.out.println("Power is = " + num1);
////        }
//////        switch(num1 * num2);
    }
}
