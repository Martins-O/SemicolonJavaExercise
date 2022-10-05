package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
//        int a =1;
//        int b = 2;
//        int[] numbers = new int[30];
//        double[] g = new double[56666];
//
//        numbers[20] = 2;
//       // System.out.println(Arrays.toString(numbers));
//     //   System.out.println("print the reference  of number  " + numbers);
//        int[] array = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
//         System.out.println("Grade distribution:");
//
//         // for each array element, output a bar of the chart
//         for (int counter = 0; counter < array.length; counter++) {
//            // output bar label ("00-09: ", ..., "90-99: ", "100: ")
//            if (counter == 10) {
//                 System.out.printf("%5d: ", 100);
//                 }
//             else {
//                 System.out.printf("%02d-%02d: ",
//                         counter * 10, counter * 10 + 9);
//                 }
//
//            // print bar of asterisks
//             for (int stars = 0;stars < array[counter] ; stars++) {
//                 System.out.print("*");
//                 System.out.println("I am the index " + array[counter]);
//                 }
//             System.out.println();
//             }

       int[] returnValue = eliminateDuplicate();
        System.out.println(Arrays.toString(returnValue));
         }
 public static int[] eliminateDuplicate(){
        int[] numbers = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
     Scanner scanner = new Scanner(System.in);

        for(int i =0; i<10; i++){
            System.out.printf("enter number %d", i+1);
            numbers[i] = scanner.nextInt();


        }
        for(int i =0; i<numbers.length; i++){
            System.out.println(Arrays.toString(numbers));

            for(int j=0; j<numbers.length; j++) {
                System.out.println("checking if " + numbers[i] +"  is the same as "+ numbers[j]);
                if (numbers[i] == numbers[j]) {


                    numbers[i] = 0;
                    break;
                }
            }
        }
        return numbers;



 }
}
