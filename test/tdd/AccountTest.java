package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    public void depositMoneyTest(){
        //given I have an account
        Account martinsAccount = new Account();
        //when i deposit 3000
        martinsAccount.deposit(3000);
        //check my balance increases by 3000
        int balance = martinsAccount.getBalance();
        assertEquals(3000, balance);
    }
    @Test
    public void negativeDepositShouldNotworkTest(){
        //given I have an account
        Account martinsAccount = new Account();
        //given that balance is 10000
        martinsAccount.deposit(10000);
        assertEquals(10000, martinsAccount.getBalance());
        //when i deposit -5000
        martinsAccount.deposit(-5000);
        //check that balance is 10000 (Assert / Test / check)
        assertEquals(10000, martinsAccount.getBalance());

    }
    @Test
    public void withdrawMoneyTest(){
        //given i have an account
        Account martinsAccount = new Account();
        //given that you have money - small money
        martinsAccount.deposit(1000);
        assertEquals(1000,martinsAccount.getBalance());
        //when i withdraw -500
        martinsAccount.withdraw(-500);
        //check if balance is 500
        assertEquals(1500, martinsAccount.getBalance());
    }

}