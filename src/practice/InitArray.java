package practice;

//Two dimensional array

public class InitArray {
    public static void main(String[] args) {
//        create and output of two-dimensional arrays
        int [][] j = {{1,2,3},{4,5}};
        int [][] i = {{1,2},{3},{4,5}};

        System.out.println("Values in array1 are: ");
        outputArray(j);//display array 1
        System.out.println("values in array2 are: ");
        outputArray(i);//display array 2
    }
    private static void outputArray(int[][] array) {
        // loop through array's row.
        for (int k = 0; k < array.length; k++) {
            // loop through column of curent row
            for (int l = 0; l < array[k].length; l++) {
                System.out.printf("%d  ", array[k][l]);
            }
            System.out.println();
        }
    }
}

