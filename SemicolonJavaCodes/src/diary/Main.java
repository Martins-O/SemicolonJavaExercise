package diary;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    private static Diary diary;
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        createDiary();
        displayLockMenu();
    }

    private static void createDiary() {
        String mainMenu = """
                Welcome to my Diary!!!
                Let's setup it up
                """;

        print(mainMenu);
        String userName = input("Enter your name: ");
        String password = input("Enter your password: ");
        diary = new Diary(userName, password);
        print("Diary created for "+userName);
    }

    private static void displayLockMenu(){
        String mainMain = """
                press
                1 -> Unlock Diary
                2 -> Lock Diary
                3 -> exit
                """;
        String userInput = input(mainMain);
        switch (Integer.parseInt(userInput)){
            case 1 -> unlockDiary();
            case 2 -> lockDiary();
            case 3 -> exitApplication();
        }
    }

    private static void exitApplication() {
        print("Thanks for using our application");
        System.exit(0);
    }

    private static void lockDiary() {
        diary.lock();
        print("Locked Successfully");
        displayLockMenu();
    }

    private static void unlockDiary() {
        String password = input("enter correct password");
        diary.unLockWith(password);
        if (diary.isLocked()){
            print("Wrong password");
            displayLockMenu();
        }
        displayDiaryMenu();
    }

    private static void displayDiaryMenu() {
        String diaryMenu = """
                press
                1 -> Create Entry
                2 -> find Entry by id
                3 -> get total number of entries
                4 -> Lock diary
                """;
        String userInput = input(diaryMenu);
        switch (Integer.parseInt(userInput)){
            case 1 -> createEntry();
            case 2 -> findById();
            case 3 -> getTotalNumberOfEntries();
            case 4 -> lockDiary();
        }
    }

    private static void getTotalNumberOfEntries() {
        int totalNumberOfEntry = diary.numberOfHappenings();
        print("You have "+totalNumberOfEntry+" Entries");
        displayDiaryMenu();
    }

    private static void findById() {
        String title = input("Enter id for the entry you wnat to find");
        Entry foundEntry = diary.findEntryWithId(Integer.parseInt(title));
        print(foundEntry.toString());
        displayDiaryMenu();
    }

    private static void createEntry() {
        String title = input("Enter title of the entry");
        String body = input("Enter body of the entry");
        diary.write(title, body);
        print("Written succesfully");
        displayDiaryMenu();
    }

    private static String input(String prompt){
        return JOptionPane.showInputDialog(null,prompt);
//        print(prompt);
//        return input.nextLine();
    }

    private static void print(String prompt){
//        System.out.println(prompt);
        JOptionPane.showMessageDialog(null, prompt);
    }
}
