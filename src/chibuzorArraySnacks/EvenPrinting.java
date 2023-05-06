package chibuzorArraySnacks;

public class EvenPrinting {
    static void evenPrint(int[] myList){
        for (int element = 0; element < myList.length ; ) {
            element = element + 2;
            System.out.print(element+" ");
        }
    }
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5,6,7,8,9,10};
        evenPrint(myArray);
    }
}
