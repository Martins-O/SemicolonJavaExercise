package tdd.GraceTask;

public class AddingArrays {
    public static void main(String[] args) {

        int[] myArray = new int[6];
        myArray [0]= 12;
        myArray[1] = 10;
        myArray [2] = 88;
        myArray [3] = 23;
        myArray[4] = 99;
        myArray[5] = 77;

        int total = 0;

        for (int j : myArray) {
            total += j;
        }
        System.out.printf("The total of arrays are: %d%n", total);
        System.out.println(myArray.length);
    }
}
