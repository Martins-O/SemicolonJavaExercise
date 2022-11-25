package chapter4;
import java.math.BigDecimal;
import java.util.Scanner;

/*(Distance between two points) Write an application that reads the x and y coordinates of
two points on a plane and prints whether the points are located on a line perpendicular to an axis.
 */
public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner maize = new Scanner(System.in);
        int y1;
        int y2;
        int x1;
        int x2;

        System.out.println("Enter point 1: ");
        y1 = maize.nextInt();

        System.out.println("Enter point 1: ");
        x1 = maize.nextInt();

        System.out.println("Enter point 1: ");
        y2 = maize.nextInt();

        System.out.println("Enter point 1: ");
        x2 = maize.nextInt();

        double sum = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);

        sum = Math.sqrt(sum);
        System.out.println(" sum is "+sum);
    }

}
