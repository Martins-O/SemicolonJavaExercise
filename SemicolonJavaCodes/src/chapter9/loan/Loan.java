package chapter9.loan;

import org.jetbrains.annotations.Contract;

public class Loan {
    private double principalAmount;
    private double loanTenure;

    public double getPrincipalAmount() {
        return principalAmount;
    }

    public void setPrincipalAmount(double principalAmount) {
        this.principalAmount = principalAmount;
    }

    public double getLoanTenure() {
        return loanTenure;
    }

    public void setLoanTenure(double loanTenure) {
        this.loanTenure = loanTenure;
    }


    static  void calculateMonthlyInstallmental(){

    }
}
