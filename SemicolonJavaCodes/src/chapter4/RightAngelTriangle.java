package chapter4;

import java.util.Scanner;

/*(Right-angled Triangle) Write an application that prompts the user to enter the length of
the base of a triangle, and uses that to draw a right-angled triangle composed of asterisks. Your
program should work for triangles of base lengths between 1 and 10.*/
public class RightAngelTriangle {

     void triangle(int count){
         for (int i = 1; i < 10; i++) {
             for (int k = 0; k < i + 1; i++)
                System.out.println("*");
             System.out.println( );
         }
     }

    public static void main(String[] args) {
        RightAngelTriangle r = new RightAngelTriangle();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length: ");
        r.triangle(Integer.parseInt(input.nextLine()));
    }
}
