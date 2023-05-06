package practice;


class Test_Returning_ArrayTest extends Test_Returning_Array {

    public static void main(String[] args) {
        Test_Returning_Array test_returning_array = new Test_Returning_Array();
        int [] numbers = {12, 34, 65, 76, 55};
        test_returning_array.addNumbers(numbers);
        numbers[0] = 12;
        numbers[1] = 34;
        numbers[2] =  65;
        numbers[3] = 76;
        numbers[4] = 55;

        System.out.println("the sum is :" + test_returning_array.addNumbers(numbers));
    }
}

