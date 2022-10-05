package tdd.ChibuzorAssignment;

public class AsterikTriangle {
    public static void main(String[] args) {
        for (int count = 0; count < 10; count++) {
            for (int i = 0; i < count + 1; i++)
                System.out.print("*");
            System.out.println();
        }
    }
}