package practice;

public class Test_Returning_Array {
//    static int[] martins(){//creating method calling arrays
//        return new int[]{12,45,65,77,55};//returning set of Array
//    }
   public int addNumbers(int[] number){
        int total = 0;
        for (int i = 0; i < number.length; i++) {
            total += number[i];
        }
       return total;
   }

//    public static void main(String[] args) {
////        int[] mar = martins(); // calling method which returns Array
////        // printing the values of array using for loops
////        for (int i = 0; i < mar.length; i++) {
////            System.out.printf("%d%n", mar[i]);
//        Passing_Array_To_Method passing_array_to_method = new Passing_Array_To_Method();
//        int[] numbers = {21, 43, 45, 66, 78, 89};
//        passing_array_to_method.addNumbers(numbers);
//        int[] numbers = new int[]
//

}
