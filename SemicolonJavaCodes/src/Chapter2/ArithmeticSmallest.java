package Chapter2;
//(Arithmetic, Smallest and Largest) Write an application that inputs three integers from the
//        user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
//        shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
//        representation of the average. So, if the sum of the values is 7, the average should be 2, not
   //     2.3333….]

import java.util.Scanner;

public class ArithmeticSmallest {
    public static void main(String[]args){
        Scanner one=new Scanner(System.in);

        int firstnum=0;
        int secondnum=0;
        int thirdnum=0;
        double sum=0;
        int average=0;
        double product=0;

        System.out.println("Enter first number:");
        firstnum=one.nextInt();

        System.out.println("Enter second number:");
        secondnum=one.nextInt();

        System.out.println("Enter third number:");
        thirdnum=one.nextInt();

        if(firstnum>secondnum & firstnum>thirdnum){
            System.out.println(firstnum + " is the greatest");

        }

        else if(secondnum>firstnum & secondnum>thirdnum){
            System.out.println(secondnum + " is the greatest");
        }
        else{
            System.out.println(thirdnum + " is the greatest");
        }
        //find the least among the numbers
        if(firstnum<secondnum & firstnum<thirdnum){
            System.out.println(firstnum + " is the lowest");

        }

        else if(secondnum<firstnum & secondnum<thirdnum){
            System.out.println(secondnum + " is the lowest");

        }
        else{
            System.out.println(thirdnum + " is the lowest");
        }
        //calculations
        sum=firstnum+secondnum+thirdnum;
        average=(int)sum/3;
        product=firstnum*secondnum*thirdnum;

        System.out.println("Sum : " +sum);
        System.out.println("Average : " +average);
        System.out.println("Product : " +product);
    }

}