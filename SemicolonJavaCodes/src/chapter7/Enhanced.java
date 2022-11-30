package chapter7;

public class Enhanced {

    public int statement(int[] numbers){
        int absolute = 0;
        for (int number:numbers) {
            absolute = (int)Math.abs(number);
        }
        return absolute;   }
}
