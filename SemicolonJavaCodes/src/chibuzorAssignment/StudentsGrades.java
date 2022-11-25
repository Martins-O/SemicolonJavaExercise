package chibuzorAssignment;

import java.util.Scanner;

public class StudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gradesum = 0;
        int gradeCounter = 0;
        String name;
        int Acount = 0;
        int Bcount =0;
        int Ccount =0;
        int Dcount = 0;
        int Ecount = 0;
        int choice = 1;

        System.out.print("Enter student name: ");
        name = scanner.nextLine();


        do {
            System.out.printf("%s%n", "Enter the integer grades in the range 0-100.");
            System.out.println("Enter student grade or quit:  ");
            int grade = scanner.nextInt();
            gradesum += grade;
            ++gradeCounter;

            switch (grade / 10) {
                case 9:
                case 10:
                    ++Acount;
                    break;

                case 8:
                    ++Bcount;
                    break;

                case 7:
                    ++Ccount;
                    break;

                case 6:
                    ++Dcount;
                    break;

                default:
                    ++Ecount;
                    break;
            }
//            for (int i = 0; i >= 0; i++) {
//
//            }
            System.out.printf("%nLetter grade: %n");

            if (gradeCounter != 0) {
                double average = (double) gradesum / gradeCounter;
                System.out.printf("Total of the %d grades entered is %d%n",
                        gradeCounter, gradesum);
                System.out.printf("Class average is %.2f%n", average);
                System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                        "Number of students who received each grade:",
                        "A: ", Acount,
                        "B: ", Bcount,
                        "C: ", Ccount,
                        "D: ", Dcount,
                        "E: ", Ecount);

                System.out.print("do you want to continue 1 for yes/ 0 for no");
                choice = scanner.nextInt();
                //  char n = 0;
                if (choice == 0) {
                    break;

                }

                System.out.println();
            }
        }
            while (choice == 1) ;


        }
}
