package tdd.Chapter4;

public class Factorial1 {
    public static void main(String[] args) {
         double e = 0;
        for (int counter = 0; counter <= 50; counter++) {
            e = e + (double) 1/ getFactorial(counter);
        }
        System.out.printf("e = %f", e);
    }
    public static long getFactorial(int number) {
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
      return factorial;
    }
}
