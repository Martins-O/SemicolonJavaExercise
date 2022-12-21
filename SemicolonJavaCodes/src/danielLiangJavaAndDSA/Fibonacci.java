package danielLiangJavaAndDSA;

import java.util.Scanner;

public class Fibonacci {

	public static long fibonacci(long index) {
		if(index == 0) {
			return 0;
		} else if(index == 1) {
			return 1;
		} else return fibonacci(index - 1) +
			fibonacci(index - 2);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an index for a Fibonacci number: ");
		int index = input.nextInt();
		System.out.println("The Fibonacci number at index "
			+ index + " is " + fibonacci(index));
	}
}
