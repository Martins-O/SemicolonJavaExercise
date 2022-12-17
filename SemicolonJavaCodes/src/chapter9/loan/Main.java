package chapter9.loan;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the Amount loan you collected: ");
		int loan = scanner.nextInt();
		System.out.println("Duration of payment for loan: ");
		int duration = scanner.nextInt();
		Loan home = new HomeLoan();
		double time2 = home.calculateMonthlyInstallmental(loan, duration);
		System.out.println("You have "+time2+" monthly for the next "+duration+ " years");
		Loan personal = new PersonalLoan();
		double time1 = personal.calculateMonthlyInstallmental(loan, duration);
		System.out.println("You have "+time1+" monthly for the next "+duration+ " years");
		Loan vehicle = new VehicleLoan();
		double time = vehicle.calculateMonthlyInstallmental(loan, duration);
		System.out.println("You have "+time+" monthly for the next "+duration+" years");

	}
}
