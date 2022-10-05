package chapter3;

import java.util.Scanner;

public class HealthRateApp {
    public static void main(String[] args) {
        Scanner martinsHealthCentre = new Scanner(System.in);
        HealthRate healthRate = new HealthRate();

        System.out.println("Enter your firstname: ");
        String firstName = martinsHealthCentre.nextLine();
        healthRate.setFirstName(firstName);

        System.out.println("Enter your lastname: ");
        String lastName = martinsHealthCentre.nextLine();
        healthRate.setLastName(lastName);

        System.out.println("Enter your gender(Male or Female): ");
        String gender = martinsHealthCentre.nextLine();
        healthRate.setGender(gender);

        System.out.println("enter your date of birth(yyyy-mm-dd): ");
        String doB = martinsHealthCentre.nextLine();
        healthRate.setDoB(doB);

        System.out.println("Display Age: " + healthRate.getAge());


        System.out.print("1 for imperial, 2 for metric: ");
        int choice = martinsHealthCentre.nextInt();

        System.out.printf("Input weight in %s: ",
                (choice == 1) ? "pounds" : "kilograms");
        double weight = martinsHealthCentre.nextDouble();
        healthRate.setWeight(weight);

        System.out.printf("Input height in %s: ",
                (choice == 1) ? "inches(ft * 12 * in)" : "metres");
        double height = martinsHealthCentre.nextDouble();
        healthRate.setHeight(height);


        System.out.println("BMI VALUES:");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal:      between 18.5 and 24.9");
        System.out.println("Overweight:  between 25 and 29.9");
        System.out.println("Obese:       30 or greater");
        System.out.println("display BMI result: " + healthRate.getBMI());
//            double getBMI = martinsHealthCentre.nextDouble();


    }
}
