package chibuzorAssignment.MyersBriggs;

import static chibuzorAssignment.MyersBriggs.Question.*;
import static java.lang.System.*;
import java.util.Scanner;

public class MyerBriggs {
    Question set;
    int aCount;

    int bCount;

    public MyerBriggs(Question set) {
        this.set = set;
    }
    Scanner input = new Scanner(in);
    Question getSets(){
        switch (set){
            case QUESTION ->{
                out.println("Choose from A and B");
                input.nextLine();
                if (QUESTION.equals("A".equalsIgnoreCase("a"))){
                    aCount++;
                }else bCount++;
            }
            case QUESTION2 -> {
                out.println("Choose from A and B");
                input.nextLine();
                if (QUESTION2.equals("A".equalsIgnoreCase("a")))
                    aCount++;
            }
            case QUESTION3 -> {
                out.println("Choose from A and B");
                input.nextLine();
                if (QUESTION3.equals("A".equalsIgnoreCase("a")))
                    aCount++;
            }
            case QUESTION4 -> {
                out.println("Choose from A and B");
                input.nextLine();
                if (QUESTION4.equals("A".equalsIgnoreCase("a")))
                    aCount++;
            }
            case QUESTION5 -> {
                out.println("Choose from A and B");
                input.nextLine();
                if (QUESTION5.equals("A".equalsIgnoreCase("a")))
                    aCount++;
            }
            case QUESTION6 -> {
                out.println("Choose from A and B");
                input.nextLine();
                if (QUESTION6.equals("A".equalsIgnoreCase("a")))
                    aCount++;
            }
        }
        return set;
    }
}
