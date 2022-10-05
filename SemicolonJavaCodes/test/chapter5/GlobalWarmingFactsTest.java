package chapter5;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class GlobalWarmingFactsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GlobalWarmingFacts global = new GlobalWarmingFacts();
        System.out.print("Enter your Full name: ");
        String playerName = scanner.nextLine();

        System.out.print("Enter answer for question one: " + global.getQuestions(1));
        String questionOne = scanner.nextLine();
        if (questionOne.equalsIgnoreCase("d")) {
            global.increaseScore();
        }

        System.out.print("Enter answer for question one: " + global.getQuestions(2));
        String questionTwo = scanner.nextLine();
        if (questionTwo.equals("D") || questionTwo.equals("d")) {
            global.increaseScore();
        }

        System.out.print("Enter answer for question one: " + global.getQuestions(3));
        String questionThree = scanner.nextLine();
        if (questionThree.equals("D") || questionThree.equals("d")) {
            global.increaseScore();
        }

        System.out.print("Enter answer for question one: " + global.getQuestions(4));
        String questionFour = scanner.nextLine();
        if (questionFour.equals("D") || questionFour.equals("d")) {
            global.increaseScore();
        }

        System.out.print("Enter answer for question one: " + global.getQuestions(5));
        String questionFive = scanner.nextLine();
        if (questionFive.equals("D") || questionFive.equals("d")) {
            global.increaseScore();
        }

        System.out.println("mart: ");
        global.getScore();
    }
}