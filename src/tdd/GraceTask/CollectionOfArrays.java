package tdd.GraceTask;
/*
Write Java statements to accomplish each of the following tasks:
a) Display the value of the tenth element of array r.
b) Initialize each of the six elements of one-dimensional integer array g to -1.
c) Find the maximum of the first one-hundred elements of floating-point array c.
d) Copy a hundred-element array an into a hundred-element array b, but in reverse order.
e) Compute the product of the third to the tenth elements, both inclusive, in a hundred-element integer array w.
*/

public class CollectionOfArrays {
    public static void main(String[] args) {
        int[] r = {12, 23, 24, 34, 56, 45, 45, 67, 78, 67};
        System.out.println(r[9]);

        int[] g = new int[6];
        g[5] = -1;

        for (int i = 0; i < g.length; i++) {
            System.out.print(g[5]);
        }
    }
}
