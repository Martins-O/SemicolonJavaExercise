package chapter9.loan;

public class Loan {
    private double principalAmount;
    private double loanTenure;

    public Loan(){}

    public Loan(double principalAmount, double loanTenure) {
        this.principalAmount = principalAmount;
        this.loanTenure = loanTenure;
    }

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


    public double calculateMonthlyInstallmental(double principalAmount, double loanTenure){

        return principalAmount / loanTenure;
    }
}
