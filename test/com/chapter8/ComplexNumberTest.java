package com.chapter8;

import org.junit.jupiter.api.*;

import static org.testng.AssertJUnit.*;

class ComplexNumberTest {

    private ComplexNumber complexNumber;


    @BeforeEach
    public void setUp(){
        complexNumber = new ComplexNumber();
    }

    @Test
    public void addingTwoComplex(){
        double real = 2;
        double imaginary = 3;

        double expected = complexNumber.addTwoComplexNumber(real,imaginary);
        assertEquals(expected, complexNumber.addTwoComplexNumber(real,imaginary));
    }

    @Test
    public void subtractTwoComplex(){
        double real = 2;
        double imaginary = 3;

        double expected = complexNumber.subtractTwoComplex(real,imaginary);
        assertEquals(expected,complexNumber.subtractTwoComplex(real,imaginary));
    }

    @Test
    public void printComplex(){
        double real = 2;
        double imaginary = 3;
        double expected = complexNumber.subtractTwoComplex(real,imaginary);
        double expecte = complexNumber.addTwoComplexNumber(real,imaginary);
        double expect = expecte + expected;
        assertEquals(expect, complexNumber.printComplexNumbers(expecte, expected));
    }

}