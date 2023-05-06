package chapter4;

public class Dangling_Else {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        if (x >= 5)
            if (y > 5)
                System.out.println("X and y are > 5");
            else
                System.out.println("X is <= 5");

    }
}
