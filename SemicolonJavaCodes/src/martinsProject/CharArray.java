package martinsProject;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {
        char[][] myArray = {{'x','o','x'},{'x','o','x'},{'x','x','o'}};
        for (char[] row : myArray) {
            for (char column : row) {
                System.out.print(column + " ");
            }
            System.out.println();

        }
        System.out.println(Arrays.deepToString(myArray));
    }
}
