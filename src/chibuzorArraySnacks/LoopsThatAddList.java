package chibuzorArraySnacks;

public class LoopsThatAddList {
    static int doWhile(int[] list){
        int sum = 0;
        int index = 0;
        do {
            sum += list[index];
            ++index;
        }while (index < list.length);
        return sum;
    }

    static int whileLoops(int[] list){
        int sum = 0;
        int index = 0;
        while (index < list.length){
            sum += list[index];
            ++index;
        }
        return sum;
    }
    static int forloops(int[] list){
        int sum = 0;
        int index = 0;
        for (int i = 0; i < list.length; i++)
            sum += list[index];
        return sum;
    }
}
