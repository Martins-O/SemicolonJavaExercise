package martinsProject;

import java.util.Scanner;

public class Problems {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] scores = new int[5];
        int count = 0;
       while (count < 5) {
           System.out.println("Enter the scores of "+scores.length+" students "+count);
           int grade = input.nextInt();
               if (grade >= 0 && grade <= 100) {
                   scores[count] = grade;
                   count++;
               }
           }
        double max = scores[0];
        for (int score: scores) {
            if (score > max) {
                max= score;
            }
        }
        System.out.println("min is "+ max);
        int min = scores[0];
        for (int score: scores) {
            if (score < min) {
                min = score;
            }
        }
        System.out.println("min is "+ min);
    }
}
