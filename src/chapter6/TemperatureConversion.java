package chapter6;

import java.util.Scanner;

public class TemperatureConversion {
    Scanner in = new Scanner(System.in);
    public double kelvin(){
        double celcius = 0;
        System.out.println("Enter the celcius --> ");
        celcius = in.nextDouble();
        System.out.println(celcius);
        double kelvin = 273.15 + celcius;
        System.out.println("Total is "+ kelvin);
        return kelvin;

    }
    public double celcius(){
        double kelvin = 0;
        System.out.println("Enter the kelvin --> ");
        kelvin = in.nextDouble();
        double celcius = kelvin - 273.15;
        System.out.println("Total is "+celcius);
        return celcius;
    }

    public static void main(String[] args) {
        TemperatureConversion temp = new TemperatureConversion();
        temp.celcius();
        temp.kelvin();

    }
}