package myersBriggs;

import java.util.Scanner;

import static java.lang.System.out;

public class MyersBriggsClass {
    static Scanner input = new Scanner(System.in);


    public static String question1() {
        print("""
                1.
                A => Expend energy,enjoy groups
                B => conserve energy, enjoy one-on-one
                """);
        String reply = input.nextLine();
        print(reply);
        return reply.toUpperCase();
    }

    public static String question2() {
        print("""
                2.
                A => Interpret literally
                b => looking for meaning and possibilities
                """);
        String reply = input.nextLine();

        return reply.toUpperCase();
    }

    public static String question3() {
        print("""
                3.
                A => Logical thinking questioning
                B => Emphatic feeling, accommodating
                """);
        String reply = input.nextLine();
        return reply.toUpperCase();
    }

    public static String question4() {
        print("""
                4.
                A  => Organized, Orderly
                B  => Flexible, Adaptable
                """);
        String reply = input.nextLine();
        return reply.toUpperCase();
    }



    public static String question5() {
        print("""
                5.
                A => More outgoing, think out loud
                B => More reserved, think to yourself
              
                """);
        String reply = input.nextLine();
        return reply.toUpperCase();
    }

    public static String question6() {
        print("""
                6.
                A => Practical, realistic, experiential
                B => Imaginative, innovative, theoretical.
                """);
        String reply = input.nextLine();
        return reply.toUpperCase();
    }

    public static String question7() {
        print("""
                7.
                A => Candid, Straight-forward, Frank
                B => tactful, kind, encouraging
                """);
        String reply = input.nextLine();
        return reply.toUpperCase();
    }

    public static String question8() {
        print("""
                8.
                A =>Plan schedule
                B => Unplanned, Spontaneous
                """);
        String reply = input.nextLine();
        return reply.toUpperCase();
    }

    public static String question9() {
        print("""
                9.
                A => seek many task, public activities, interaction with others
                B => seek private, solitary with quiet to concentrate
                """);
        String reply = input.nextLine();
        return reply.toUpperCase();
    }

    public static String question10() {
        print("""
                10.
                A => Standard, usual, conventional
                B => different, novel, unique
                """);
        String reply = input.nextLine();
        return reply.toUpperCase();
    }

    public static String question11() {
        print("""
                11.
                A => Firm, tend to criticize, hold the line
                B => gentle, tend to appreciate, conciliate
                """);
        String reply = input.nextLine();
        return reply.toUpperCase();
    }

    public static String question12() {
        print("""
                12.
                A => regulated, structured
                B => Easy going, "live" and "lets live"
                """);
        String reply = input.nextLine();
        return reply.toUpperCase();
    }

    public static String question13() {
        print("""
                13.
                A => External, communicative, express yourself
                B => Internal, reticent, keep to yourself
                """);
        String reply = input.nextLine();
        return reply.toUpperCase();
    }

    public static String question14() {
        print("""
                14.
                A => Focus on here and now
                B => Look to the future, global  perspective, big picture
                """);
        String reply = input.nextLine();
        return reply.toUpperCase();
    }

    public static String question15() {
        print("""
                15.
                A => tough-minded, just
                B => tender-hearted, merciful
                """);
        String reply = input.nextLine();
        return reply.toUpperCase();
    }

    public static String question16() {
        print("""
                16.
                A => preparation plan ahead
                B => go with the flow, adapt as you go
                """);
        String reply = input.nextLine();
        return reply.toUpperCase();
    }

    public static String question17() {
        print("""
                17.
                A => Active, initiate
                B => reflective, deliberate
                """);
        String reply = input.nextLine();
        return reply.toUpperCase();
    }

    public static String question18() {
        print("""
                18.
                A => facts, things and what is
                B => ideas, dreams "what could be", philosophical
                """);
        String reply = input.nextLine();
        return reply.toUpperCase();
    }

    public static String question19() {
        print("""
                19.
                A => matter of facts, issue-oriented
                B => Sensitive, people oriented and compassionate
                """);
        String reply = input.nextLine();
        return reply.toUpperCase();
    }
    public static String question20() {
        print("""
                20.
                A => Control, govern
                B => Latitude,freedom
                """);
        String reply = input.nextLine();
        return reply.toUpperCase();
    }
    public static void print(String text){
        out.println(text);
    }
    public static void input(String text){
        input.nextLine();
    }
    public static int input(){
        return input.nextInt();
    }
    public static void input(double number){
        input.nextDouble();
    }
}
