package danielLiangJavaAndDSA;

import static myersBriggs.MyersBriggsClass.print;

public class TestStackOfIntegers {
    public static void main(String[] args) {
        StackInteger stack = new StackInteger();
        for (int element = 0; element < 10; element++) {
            stack.push(element);

            while (!stack.isEmpty())
                print(stack.pop()+" ");
        }
    }
}
