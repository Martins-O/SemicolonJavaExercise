package practice;

/**
 * (Eggs per Box) Typically 6 eggs fit in one box. Write a script to calculate the number of boxes a farmer
 * needs to store 28 eggs. The script will also determine how many eggsare placed in the last uncompleted box,
 * and how many additional eggs are needed to fill this last box.
 */

public class Eggs {
    public static void main(String[] args) {
        int box = 6;
        int eggs = 28;
        double eggShare = box % eggs;
        System.out.println(eggShare);
    }
}
