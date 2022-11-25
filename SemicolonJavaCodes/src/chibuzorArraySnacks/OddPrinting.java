package chibuzorArraySnacks;

public class OddPrinting {
    static void oddPrint(int[] myArray){
        for (int element = 1; element < myArray.length ; ) {
            element = element +2;
            System.out.print(element+" ");
        }
    }

    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5,6,7,8,9,10};
        oddPrint(myArray);
    }
}
