package tdd.Chapter4;

//Validating User Input) Modify the program in
//Fig. 4.12 to validate its inputs. For any in
//put, if the value entered is other than 1 or 2,
//keep looping until the user enters a correct value.

import java.util.Scanner;

@SuppressWarnings("ReassignedVariable")
public class ValidateUserInput {
    public static void main(String[] args) {
        Scanner us = new Scanner(System.in);
        int studentCounter =0;
        int passes =0;
        int failures = 0;

        while (studentCounter <= 10){
            System.out.println("Enter result (1 = pass, 2= fail): ");
            int result = us.nextInt();

            if(result == 1 || result == 2) {
                if (result == 1) {
                    passes = passes + 1;
                } else {
                    failures = failures + 1;
                }
            }
            else {
                System.out.println("Enter result (1 = pass, 2= fail): ");
                result = us.nextInt();
            }
            studentCounter = studentCounter + 1;
        }
        System.out.printf("passed %d%n:     failed %d%n: ",passes, failures);
        if (passes > 8){
            System.out.println("Bonus to instructor");
        }
    }
}
