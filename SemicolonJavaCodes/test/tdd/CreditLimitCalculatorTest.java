package tdd;

import java.util.Scanner;

class CreditLimitCalculatorTest {
    public static void main(String[] args) {
        CreditLimitCalculator calculator = new CreditLimitCalculator(0,0,0,0,0,0);
        Scanner input = new Scanner(System.in);
        int account = 1;
        int balance;
        int items;
        int limit;
        int totalcred;
        int Balance;

        while(calculator.getAccountNumber(account) != 0){
        }
        System.out.println("Enter the customer account number: ");
        account = input.nextInt();
        calculator.setAccountNumber(account);

        System.out.println("Enter the customer Balance at start of the month: ");
        balance = input.nextInt();
        calculator.setBalance(balance);

        System.out.println("Enter the credit limit: ");
        limit= input.nextInt();
        calculator.setCreditLimit(limit);

        System.out.println("Enter the total amount of charges: ");
        items = input.nextInt();
        calculator.setItems(items);

        System.out.println("Enter the total amount of credits: ");
        totalcred = input.nextInt();
        calculator.setTotalCredit(totalcred);

        System.out.println("The custosmers new balance is: " +calculator.setNewBalance());
        if(calculator.setBalance(balance) > calculator.setCreditLimit(limit)){
            System.out.println("Credit limit exceeded");
        }
    }

}