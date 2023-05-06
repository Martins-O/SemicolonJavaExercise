package tdd;

public class CreditLimitCalculator {
    private int accountNumber;
    int balanceStartOfMonth;
    int itemsCharged;
    int creditLimit;
    int totalCredit;
    int newBalance;
    public CreditLimitCalculator(int account, int balance, int items, int limit, int totalCred, int Balance){
        int accountNumber = account;
        int balanceStartOfMonth = balance;
        int itemsCharged = items;
        int creditLimit = limit;
        int totalCredit = totalCred;
        int newBalance = Balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber(int account) {
        return accountNumber;
    }

    public int setBalance(int newBalance) {
        this.balanceStartOfMonth = newBalance;
        return balanceStartOfMonth;
    }


    public void setItems(int itemsCharged) {
        this.itemsCharged = itemsCharged;
    }

    public int getItemsCharged() {
        return itemsCharged;
    }

    public void setTotalCredit(int totalCredit) {
        this.totalCredit = totalCredit;
    }

    public int getTotalCredit() {
        return totalCredit;
    }

    public int setCreditLimit(int limit) {
        this.creditLimit = creditLimit;
        return creditLimit;
    }
    public int setNewBalance(){
        this.newBalance = newBalance;
        newBalance = balanceStartOfMonth + itemsCharged - totalCredit;
        return newBalance;
    }
}
