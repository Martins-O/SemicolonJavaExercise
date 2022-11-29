package com.chapter8;

import java.io.PrintStream;

public class ComplexNumber {

    private double realPart;
    private double imaginaryPart;

    public ComplexNumber(){}

    public ComplexNumber(int realPart, int imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double addTwoComplexNumber(double realPart, double imaginaryPart){
        double realTotal = realPart + realPart;
        double imaginaryTotal = imaginaryPart + imaginaryPart;

        return realTotal+imaginaryTotal;

    }

    public double subtractTwoComplex(double realPart, double imaginaryPart){
        double realTotal = realPart - realPart;
        double imaginaryTotal = imaginaryPart - imaginaryPart;

        return realTotal - imaginaryTotal;
    }

    public PrintStream printComplexNumbers(double realPart, double imaginaryPart){
       return System.out.printf("The real part: %.2f\t The imaginary part: %.2f",realPart, imaginaryPart);

    }
}
