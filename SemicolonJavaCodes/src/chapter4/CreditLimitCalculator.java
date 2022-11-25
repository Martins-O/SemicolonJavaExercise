package chapter4;

public class CreditLimitCalculator {
    private String accountNumber;
    private double balanceAtTheMonth;
    private double itemsCharged;
    private double customersCharge;
    private double creditLimit;
    public CreditLimitCalculator(){
    }

    public CreditLimitCalculator(String accountNumber, int balanceAtTheMonth, int itemsCharged, int customersCharge, int creditLimit) {
        this.accountNumber = accountNumber;
        this.balanceAtTheMonth = balanceAtTheMonth;
        this.itemsCharged = itemsCharged;
        this.customersCharge = customersCharge;
        this.creditLimit = creditLimit;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalanceAtTheMonth() {
        return balanceAtTheMonth;
    }

    public void setBalanceAtTheMonth(double balanceAtTheMonth) {
        this.balanceAtTheMonth = balanceAtTheMonth;
    }

    public double getItemsCharged() {
        return itemsCharged;
    }

    public void setItemsCharged(double itemsCharged) {
        this.itemsCharged = itemsCharged;
    }

    public double getCustomersCharge() {
        return customersCharge;
    }

    public void setCustomersCharge(double customersCharge) {
        this.customersCharge = customersCharge;
    }

    public double getCreditLimit() {
        return creditLimit;
    }


    public void setCreditLimit(double balanceAtTheMonth, double customersCharge) {
        creditLimit = balanceAtTheMonth - customersCharge;
    }

    public double newBalance(double balanceAtTheMonth, double customersCharge, double creditLimit){
        double balance = balanceAtTheMonth + customersCharge - creditLimit;
        return balance;
    }
}
