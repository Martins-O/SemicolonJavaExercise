package com.chapter8;

import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.*;

class SavingsInterestTest {
    private SavingsInterest savingsInterest;

    @BeforeEach
    public void setUp(){
        savingsInterest = new SavingsInterest();
    }

    @Test
    public void testThatFor4Percent(){
        double annualInterest = 0.04;
        double balance = 2000.00;
        savingsInterest.calculatingMonthlyInterest
                (annualInterest, balance);
        double expected = savingsInterest.calculatingMonthlyInterest
                (annualInterest, balance);
        assertEquals(expected, savingsInterest.calculatingMonthlyInterest
                (annualInterest, balance));

        double annualInterest2 = 0.04;
        double balance2 = 3000.00;
        savingsInterest.calculatingMonthlyInterest
                (annualInterest2, balance2);
        double xpected = savingsInterest.calculatingMonthlyInterest
                (annualInterest2, balance2);
        assertEquals(xpected, savingsInterest.calculatingMonthlyInterest
                (annualInterest2, balance2));
    }
    @Test
    public void testThatFore5Percent(){
        double annualInterest = 0.05;
        double balance = 2000.00;
        double expected = SavingsInterest.modifyInterestRate
                (annualInterest, balance);
        assertEquals(expected, SavingsInterest.modifyInterestRate
                (annualInterest, balance));

        double annualInterest2 = 0.05;
        double balance2 = 3000.00;
        double xpected = SavingsInterest.modifyInterestRate
                (annualInterest2, balance2);
        assertEquals(xpected, SavingsInterest.modifyInterestRate
                (annualInterest2, balance2));
    }
}