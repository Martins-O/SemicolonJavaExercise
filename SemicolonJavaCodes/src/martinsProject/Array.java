package martinsProject;

//import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        double[] myList = new double[10];
//        System.out.print("Enter " + myList.length + " values: ");
//        int i;
//        for (i = 0; i < myList.length; i++)
//            myList[i] = input.nextDouble();
//        System.out.println();
        for (int j = 0; j < myList.length; j++) {
            myList[j] = Math.random() * 100;
            System.out.println(myList[j]);
        }
        double max = myList[0];
        for (double v : myList) {
            if (v > max) {
                max = v;
            }
        }
        System.out.println("max is "+ max);
        double min = myList[0];
        for (double k: myList) {
            if (k < min) {
                min = k;
            }
        }
        System.out.println("min is "+ min);
    }
}
