package studentGrade;

import java.util.Scanner;

import static java.lang.System.*;
import static myersBriggs.MyersBriggsClass.*;

public class Grade {
    static Scanner input = new Scanner(in);

    private int subjectScore1;
    private int subjectScore2;
    private int subjectScore3;
    static int[] myArray;
    static void student(){
        int number = 0;
        print("How many student do you have? ");
        number = input();
        myArray = new int[number];
        for (int numbers = 0; numbers< number; numbers++){
            print("Enter the grades: ");
            int grades = input();
            myArray[numbers] = grades;
        }
    }

    int total(){
        int total = 0;
        for (int num: myArray) {
            total += num;
        }
        return total;
    }

    public int getSubjectScore1() {
        return subjectScore1;
    }

    public void setSubjectScore1(int subjectScore1) {
        out.println("");
        this.subjectScore1 = subjectScore1;
    }

    public int getSubjectScore2() {
        return subjectScore2;
    }

    public void setSubjectScore2(int subjectScore2) {
         this.subjectScore2 = subjectScore2;
    }

    public int getSubjectScore3() {
        return subjectScore3;
    }

    public void setSubjectScore3(int subjectScore3) {
        this.subjectScore3 = subjectScore3;
    }
}