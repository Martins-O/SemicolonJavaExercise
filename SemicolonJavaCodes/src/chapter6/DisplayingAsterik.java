package chapter6;

public class DisplayingAsterik {

    public static void asterik(int time){
        for (int rows = 0; rows < time; rows++) {
            for (int column = 0; column < time; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       asterik(8);
    }
}
