package chibuzorAssignment;


public class ArrayMethod {
        public static int addingOfArray(){
             int[] array = {1, 2, 3, 4};
             int sum = 0;
             for (int num : array) {
                 sum = sum + num;
            }
             return sum;
        }
        public static int findingMax(){
            int[] array = {1, 2, 3, 4};
            int max = array[0];
            for (int num : array) {
                if (array[1] > max){
                    max = array[1];
                }
                if (array[2] > max){
                    max = array[2];
                }
                if (array[3] > max){
                    max = array[3];
                }
            }
            return max;
        }
        public static int findingMin(){
            int[] array = {1, 2, 3, 4};
            int min = array[0];
            for (int num : array) {
                if (array[1] < min){
                    min = array[1];
                }
                if (array[2] < min){
                    min = array[2];
                }
                if (array[3] < min){
                    min = array[3];
                }
            }
            return min;
        }
        public static int addingArrayWithoutElement() {
            int sum = 0;
            int[] myArray = {5, 2, 3, 1, 4};
            for (int num : myArray) {
                sum = sum + num;
            }
            for (int num: myArray) {
            }
            return sum;
        }

    public static void main(String[] args) {
        int array = addingArrayWithoutElement();
        System.out.println(array);
        System.out.println(findingMin());
        System.out.println();

    }
}
