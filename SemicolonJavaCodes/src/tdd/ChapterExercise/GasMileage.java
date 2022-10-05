package tdd.ChapterExercise;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {

        Scanner gas = new Scanner(System.in);
        int miles;
        int gallonOfFuel;
        int totalMiles = 0;
        int totalGallons = 0;
        double milesPerGallon;

        System.out.println("Enter mile driven or -1 to quit: ");
        miles = gas.nextInt();

        System.out.println("Enter gallons of gas or -1 to quit: ");
        gallonOfFuel= gas.nextInt();

        while(miles != -1 & gallonOfFuel != -1){

            totalGallons = totalGallons + gallonOfFuel;
           totalMiles = totalMiles + miles;

            System.out.println("Enter gallons of gas or -1 to quit: ");
            gallonOfFuel= gas.nextInt();

            System.out.println("Enter miles of driven or -1 to quit: ");
            miles = gas.nextInt();
        }
        if(totalGallons != 0 & totalMiles != 0){
            milesPerGallon = (double) totalMiles / totalGallons;
            System.out.println("Miles per Gallon is: " + milesPerGallon);
        }
        else{
            System.out.println("No miles or gallon entered");
        }
    }
    }
