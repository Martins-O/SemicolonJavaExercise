package chapter9.loan;

import diary.Main;
import org.junit.jupiter.api.BeforeEach;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class LoanTest {

    private Loan loan;

    @BeforeEach
    public void atSetUp(){
        loan = new Loan(20_000.00, 12.0);
//        loan = new VehicleLoan();
//        loan = new HomeLoan();
//        loan = new PersonalLoan();
    }

    public static void main(String[] args) {
        Scanner inputscan = new Scanner(System.in);
        double principal = Double.parseDouble(Main.input("Enter the loan amount: "));
        double tenure = Double.parseDouble(Main.input("Enter the tenure: "));

        Loan loan1 = new PersonalLoan();
        Main.print(String.valueOf("you we be paying "+loan1.calculateMonthlyInstallmental(principal,tenure)+" monthly"));


    }

}