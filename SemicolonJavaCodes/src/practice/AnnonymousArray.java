package practice;

import org.jetbrains.annotations.NotNull;

//you don't need to declare array in passing array to method.
public class AnnonymousArray {
    static void printArray(int []mar){
        for (int j : mar) {
            System.out.println(j);
        }
    }

    public static void main(String[] args) {

    }
}
