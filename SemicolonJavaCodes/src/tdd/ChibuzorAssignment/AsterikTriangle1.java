package tdd.ChibuzorAssignment;

public class AsterikTriangle1 {
    public static void main (String[] args) {
        for (int count =11; count >= 0; count--) {
            for (int j=0; j < count-1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
