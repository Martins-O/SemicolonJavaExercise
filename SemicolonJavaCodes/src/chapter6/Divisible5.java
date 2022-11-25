package chapter6;
//(Divisible by 5) Write a method isDivisible that uses the remainder operator (%) to determine
//         whether ten input integers are divisible by 5 or not. The method should take an integer argument
//        and return true if the integer is divisible by 5 and false otherwise. Incorporate this method
//        into an application that inputs a sequence of integers (one at a time) and determines the result.

public class Divisible5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i+ "  ");
            for(int a=1; a<= 10; a++){
                System.out.print(" "+a * i);
            }
            System.out.println();
        }

    }
}