package chibuzorAssignment.MyersBriggs;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        MyerBriggs myer = new MyerBriggs(Question.QUESTION);
        MyerBriggs myer1 = new MyerBriggs(Question.QUESTION5);
        MyerBriggs myer2= new MyerBriggs(Question.QUESTION2);
        MyerBriggs myer3 = new MyerBriggs(Question.QUESTION3);
        MyerBriggs myer4 = new MyerBriggs(Question.QUESTION4);
//        MyerBriggs myer = new MyerBriggs(Question.QUESTION);
//        MyerBriggs myer = new MyerBriggs(Question.QUESTION);
//        MyerBriggs myer = new MyerBriggs(Question.QUESTION);
//        MyerBriggs myer = new MyerBriggs(Question.QUESTION);
//        MyerBriggs myer = new MyerBriggs(Question.QUESTION);
//        MyerBriggs myer = new MyerBriggs(Question.QUESTION);
//        MyerBriggs myer = new MyerBriggs(Question.QUESTION);
        out.println(myer.getSets());
        out.println(myer1.getSets());
        out.println(myer2.getSets());
        out.println(myer3.getSets());
        out.println(myer4.getSets());
    }
}
