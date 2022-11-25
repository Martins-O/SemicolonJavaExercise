package chibuzorArraySnacks;

public class Reverse {
    static void reverse(int[] myArray, int lenght){
        int[] myList = new int[lenght];
        int temp = lenght;
        for (int i = 0; i <lenght ; i++) {
            myList[temp - 1] = myArray[i];
            temp = temp - 1;
        }
        System.out.println("Reversed array is: ");
        for (int k = 0; k < lenght; k++) {
            System.out.print(myList[k]+" ");
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80,90, 100};
        reverse(array, array.length);
    }
}
