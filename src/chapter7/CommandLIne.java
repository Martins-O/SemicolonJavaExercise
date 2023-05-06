package chapter7;

public class CommandLIne {

    public int average(int [] numbers){
        int total = 0;
        for(int number : numbers){
            total+=number;
        }
        return total/ numbers.length;
    }

    public int maximum(int[] numbers){
        int largest = numbers[0];
        for(int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }
        return largest;
    }

    public int manimum(int[] numbers){
        int smallest = numbers[0];
        for(int number : numbers) {
            if (number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }
}
