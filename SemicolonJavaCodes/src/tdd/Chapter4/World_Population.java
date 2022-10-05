package tdd.Chapter4;

import java.time.Year;
import java.util.Scanner;

public class World_Population {
    public static void main(String[] args) {
        Scanner current = new Scanner(System.in);
        System.out.println("Enter the current year population: ");
        double currentYear = current.nextDouble();
         double growth = 2.30;
         double population = currentYear;
         int year = 1;
        System.out.println("YEAR:\tPOPULATION:\tGROWTH");
        while (year <= 75){
            double overgrowth = (population * growth) / 100;
            population = population + overgrowth;
            System.out.printf("%d:    %.2f    %.2f", year,population,overgrowth);
            System.out.println();

            if ((population/currentYear)>= 2 && (population/currentYear)<= 2.03)
                System.out.println("Double Population");
            year++;
        }
    }
}
