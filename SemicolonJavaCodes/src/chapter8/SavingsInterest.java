package chapter8;
//todo(Savings Account Class) Create class SavingsAccount. Use a static variable annualInter-
//todo estRate to store the annual interest rate for all account holders. Each object of the class contains a
//todo private instance variable savingsBalance indicating the amount the saver currently has on deposit.
//todo Provide method calculateMonthlyInterest to calculate the monthly interest in multiplying the
//todo savingsBalance by annualInterestRate divided by 12—this interest should be added to savings-
//todo Balance. Provide a static method modifyInterestRate that sets the annualInterestRate to a new
//todo value. Write a program to test class SavingsAccount. Instantiate two savingsAccount objects, sav-
//todo er1 and saver2, with balances of $2000.00 and $3000.00, respectively. Set annualInterestRate to
//todo 4%, then calculate the monthly interest for each of 12 months and print the new balances for both
//todo savers. Next, set the annualInterestRate to 5%, calculate the next month’s interest and print the
//todo new balances for both savers.
//static annualInterestRate.
//savings,
//methods = CalculatingMonthlyInterest {anual * savings / 12 = +savings)
//static method = modifyInterestRate =

public class SavingsInterest {
    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsInterest(){}
    public SavingsInterest(double savingsBalance, double annualInterestRate) {
        this.savingsBalance = savingsBalance;
        SavingsInterest.annualInterestRate = annualInterestRate;
    }
    public double calculatingMonthlyInterest(double annualInterestRate, double savingsBalance){

        return annualInterestRate * savingsBalance / 12;
    }

    public static double modifyInterestRate(double interest, double savings){

        return interest + savings;
    }
}
