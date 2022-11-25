package chapter7;

/*Write Java statements to accomplish each of the following tasks:
a) Display the value of the tenth element of array r.
b) Initialize each of the six elements of one-dimensional integer array g to -1.
c) Find the maximum of the first one-hundred elements of floating-point array c.
d) Copy a hundred-element array an into a hundred-element array b, but in reverse order.
e) Compute the product of the third to the tenth elements, both inclusive, in a hundred-element integer array w.*/
public class Exercise {

    public int displayValue(int expected){
        int[] myArray = new int[expected];
        return expected;
    }

    public boolean arrayInitializer(int[] myArray) {
      myArray = new int[10];
//      myArray = {}
      return false;
    }
    public int largestElement(int[] arr, int size) {
        // sort the array in ascending order
        int largest_element = arr[size-1];
        return largest_element;
    }

}
