package practice;

public class Passing_Array_To_Method {
//    creating a method that receive array as parameter
    static void martins(int... array){
        int martins = array[0];
        for (int i = 1; i < array.length; i++) {
            if (martins > array[i]) {
                martins = array[i];
                System.out.println(martins);
            }
        }

    }

  public static void main(String[] args) {
        int[] a ={33,3,4,5};//declaring and initializing an array
      martins(a);//passing array to method
  }
}
