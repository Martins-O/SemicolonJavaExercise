package Chapter2;

public class Assuming {
    public static void main(String[] args) {
        int X = 5;
        int y = 1;

        System.out.printf("x = %d%n", X + 5);
        System.out.printf("Value of %d *%d is %d\n", X, y, (X * y) );
        System.out.printf("x is %d and y is %d", X, y);
        System.out.printf("%d is not equal to %d\n", (X+ y), (X * y) );
    }
}
