package chapter8;

public class ComplexNumber {

    private double realPart;
    private double imaginaryPart;

    public ComplexNumber(){}

    public ComplexNumber(int realPart, int imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public void addTwoComplexNumber(double realPart, double imaginaryPart){
        double realTotal = realPart + realPart;
        double imaginaryTotal = imaginaryPart + imaginaryPart;
    }

    public void subtractTwoComplex(double realPart, double imaginaryPart){
        double realTotal = realPart - realPart;
        double imaginaryTotal = imaginaryPart - imaginaryPart;
    }

    public void printComplexNumbers(double realPart, double imaginaryPart){
        System.out.printf("%.2f\t%");
    }
}
