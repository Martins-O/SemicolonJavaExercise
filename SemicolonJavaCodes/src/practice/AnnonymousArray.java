package practice;

import org.jetbrains.annotations.NotNull;

//you don't need to declare array in passing array to method.
public class AnnonymousArray {
    static void printArray(int @NotNull []mar){
        for (int i = 0; i < mar.length ; i++) {
            System.out.println(mar[i]);
        }
    }
}
