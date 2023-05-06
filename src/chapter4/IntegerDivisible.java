package chapter4;
//(Integers Divisible by 3) Write an application that calculates the sum of those integers between
//        1 and 30 that are divisible by 3.

public class IntegerDivisible {
    public static void main(String[] args) {
        System.out.println("Divided by 3: ");
        for (int i = 0; i < 30; i++) {
          if(i % 3 == 0)
              System.out.print(i + "  ");

        }
    }
}
