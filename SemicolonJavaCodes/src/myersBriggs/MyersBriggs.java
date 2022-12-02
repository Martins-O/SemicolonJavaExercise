package myersBriggs;

import static myersBriggs.Myers.*;

public class MyersBriggs {
    public static void main(String[] args) {
        for (int questionNumber = 1; questionNumber < 2; questionNumber++) {
            switch (questionNumber){
                case 1: questionOne();
                case 2: questionTwo();
                case 3: questionThree();
                case 4: questionFour();
                case 5: questionFive();
                case 6: questionSix();
                case 7: questionSeven();
                case 8: questionEight();
                case 9: questionNine();
                case 10: questionTen();
                case 11: questionEleven();
                case 12: questionTwelve();
                case 13: questionThirteen();
                case 14: questionFourteen();
                case 15: questionFifteen();
                case 16: questionSixteen();
                case 17: questionSeventeen();
                case 18: questionEighteen();
                case 19: questionNineteen();
                case 20: questionTwenty();
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + questionNumber);
            }
        }
        System.out.println(" ".repeat(4));
        System.out.printf("%s \t %s \t %s \t %s", getPartOne(), getPartTwo(), getPartThree(), getPartFour());
    }
}
