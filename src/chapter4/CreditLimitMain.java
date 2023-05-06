package chapter4;

import java.util.Scanner;

public class CreditLimitMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CreditLimitCalculator credit = new CreditLimitCalculator();
        System.out.println("Enter the Costomer account number: ");
        String accNum = input.nextLine();
        credit.setAccountNumber(accNum);
        System.out.println("Enter the amount the customer start with at the beginning of the month: ");
        double balance = input.nextDouble();
        credit.setBalanceAtTheMonth(balance);
        System.out.println("Enter the total items charged by the customer: ");
        double items = input.nextDouble();
        credit.setItemsCharged(items);
        System.out.println("Enter the credit applied to the customer's account this month: ");
        double credits = input.nextDouble();
        credit.setCustomersCharge(credits);

        credit.setCreditLimit(credit.getBalanceAtTheMonth(), credit.getCustomersCharge());
        System.out.println("The new balance for the is "+credit.newBalance(credit.getBalanceAtTheMonth(), credit.getCustomersCharge(), credit.getCreditLimit()));


    }
}
