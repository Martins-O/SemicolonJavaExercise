package chibuzorAssignment;

import java.util.Scanner;

public class StudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gradeSum = 0;
        int gradeCounter = 0;
        String name;
        int aCount = 0;
        int bCount =0;
        int cCount =0;
        int dCount = 0;
        int eCount = 0;
        int choice = 1;
        String gradeCount;


        do {
            System.out.print("Enter student name: ");
            name = scanner.next();
            System.out.printf("%s%n", "Enter the integer grades in the range 0-100.");
            System.out.println("Enter student grade or quit:  ");
            int grade = scanner.nextInt();
            gradeSum += grade;
            ++gradeCounter;

            switch(grade / 10) {
                case 9, 10 -> ++ aCount;
                case 8 -> ++ bCount;
                case 7 -> ++ cCount;
                default -> ++ dCount;
            }
            if(grade >= 90){
                gradeCount = "A";
            }
            else if(grade >= 80 ){
                gradeCount = "B";
            } else if(grade >= 70) {
                gradeCount = "C";
            } else if(grade >= 60) {
                gradeCount = "D";
            }else gradeCount = "E";

            System.out.println("student name: "+name);
            System.out.printf("Letter grade: %s%n",gradeCount);

            if (gradeCounter != 0) {
                double average = (double) gradeSum / gradeCounter;
                System.out.printf("Total of the %d grades entered is %d%n",
                        gradeCounter, gradeSum);
                System.out.printf("Class average is %.2f%n", average);
                System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                        "Number of students who received each grade:",
                        "A: ", aCount,
                        "B: ", bCount,
                        "C: ", cCount,
                        "D: ", dCount,
                        "E: ", eCount);

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
