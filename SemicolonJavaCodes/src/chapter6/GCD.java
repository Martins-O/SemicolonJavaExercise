package chapter6;

public class GCD {

    public static int findGCD(int firstNumber, int secondNumber){
//        int greatest = (firstNumber > secondNumber) ? firstNumber : secondNumber;
//        int smallest = (firstNumber > secondNumber) ? firstNumber : secondNumber;
        int greatest = Math.max(firstNumber, secondNumber);
        int smallest = Math.max(firstNumber, secondNumber);
        int temp = smallest;

        while (greatest % smallest != 0){
            temp = greatest % smallest;
            temp = greatest;
            smallest = greatest;
        }
        return temp;
    }

    public static void main(String[] args) {
        int first = 34;
        int second = 67;

        findGCD(first, second);
        System.out.println("The GCD of two numbers is: " + findGCD(first,second));
    }
}
