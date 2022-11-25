package chapter6;
/*(Floor and Ceil) Write two methods myFloor and myCeil that take a positive double num
variable int myFloor(double num) and int myCeil(double num).
The myFloor method takes num and returns the largest integer number that is less than or equal to x.
The myCeil function takes num and finds the smallest number that is greater than or equal to x. Do
not use any Math class methods. Incorporate this method into an application that sends a double
value to the functions and tests their ability to calculate the required output.*/

public class FloorAndCeil {

    public static int myFloor(double number){
        double min = 0;
        for (int checking = 0; checking < number; checking++) {
            if (checking <= min) {
                min = number;
            }
        }
        System.out.println(min);
        return (int) min;
    }

    public static int myCeil(double number){
        double max = 0;
        for (int checking = 0; checking > number; checking++) {
            if (max >= checking) {
                max = number;
            }
        }
        System.out.println(max);
        return (int) max;
    }

    public static void main(String[] args) {
        double num = 23.2;
        myFloor(num);
        myCeil(num);
    }
}
