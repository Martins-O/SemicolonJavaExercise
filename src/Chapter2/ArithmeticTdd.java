package Chapter2;

public class ArithmeticTdd {


    public int squareOfnum(double squ1, double squ2) {
        return (int) Math.pow(squ1,2) + (int) Math.pow(squ2,2);
    }

    public int difference(int squ1, int squ2) {
        return (int) Math.pow(squ1,2) - (int) Math.pow(squ2,2);
    }

    public int getSquare(int num) {
        return num*num;
    }
}