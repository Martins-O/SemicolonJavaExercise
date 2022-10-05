package tdd.Chapter4;
//(The Sum of a Series) Find the summation of the sequence of numbers 1, 2, 3 … n, where
//        n ranges from 1 to 100. Use type long. Display the results in a tabular format that shows n and the
//        corresponding sum. If this were a product instead of a sum, what difficulty might you encounter
//        with the variable that accumulates the product?
public class TheSumOfSeries {
    public static void main(String[] args) {
       System.out.printf("%s%8s%8s%8s","N", "N1","N2", "N3","N4" );
        for (long i = 1; i <= 100; i++){
            System.out.printf("%d%8d", i , i+i );
        }
    }
}
