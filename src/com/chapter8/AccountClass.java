package com.chapter8;
/*(Account Class with BigDecimal balance) Rewrite the
Account class of Section 3.4 to store
the balance as a BigDecimal object and
to perform all calculations using BigDecimals.*/

import java.math.BigDecimal;

public class AccountClass {
    private String name;
    private BigDecimal balance;

    public AccountClass(String name, BigDecimal balance) {
        this.name = name;
        validateBalance(balance);
        this.balance = balance;
    }

    public void validateBalance(BigDecimal balance){
        boolean isValidBalance = balance.compareTo(BigDecimal.ZERO) < 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        AccountClass accountClass = new AccountClass("Martins", new BigDecimal(-1));
    }
}
