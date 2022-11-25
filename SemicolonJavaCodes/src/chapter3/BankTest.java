package chapter3;

import java.util.Scanner;
public class BankTest{
       public static void main(String[] args){
	Bank bank1  = new Bank("Martins", 24.00);
	Bank bank2  = new Bank("Viceroy", -3.33);
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter withdrawal amount for bank1: ");
	double withdrawalAmount = input.nextDouble();
	bank1.withdrawal(withdrawalAmount);

	System.out.printf("%s balance: $%.2f%n",
	    bank1.getName(), bank1.getBalance());

	System.out.print("Enter withdrawal amount for bank2: ");
	double withdrawAmount = input.nextDouble();
	bank2.withdrawal(withdrawAmount);

	System.out.printf("%s balance: $%.2f%n",
	    bank2.getName(), bank2.getBalance());
}
}