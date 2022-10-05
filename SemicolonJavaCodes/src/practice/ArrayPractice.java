package practice;

public class ArrayPractice {
    public static void main(String[] args) {
//        int[] array = new int[10];

        int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
        System.out.printf("%s%8s%n", "Index", "Value");

        for (int counter = 0; counter < array.length ; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);

        final int ARRAY_LENGTH = 10;
//        int[] array = new int[ARRAY_LENGTH];

        for (int i = 0; i < array.length; i++) {
            array[i] = 2 + 2 * i;
        }
        System.out.printf("%s%8s%n", "Index", "Value");

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%5d%8d%n", i, array[i]);
        }
        int[] martin = new int[10];

        System.out.println("name " + martin[0]);
        System.out.println("name " + martin[2]);
        System.out.println("name " + martin[4]);
        System.out.println("name " + martin[9]);

        for (int i = 0; i < martin.length; i++) {
            System.out.println("name[" + i + "]" + martin[i]);

            martin[0] = 188;
            martin[1] = 178;
            martin[2] = 390;
            martin[3] = 465;
            martin[4] = 88;
            martin[5] = 980;
            martin[6] = 400;

            System.out.println();
            System.out.println("==== re-reading after written operation ====");
            for (int c = 0; i < martin.length; i++) {
                System.out.println("name[" + i + "]" + martin[i]);

            }
        }
        String[] cars = {"volvo", "BMW", "Lexus", "MICRA", "BENZ"}; // initializing values to array
        cars[0] = "MITSUBISHI"; //Changing a value in array
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]); // looping in array
        }
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        System.out.println(cars[3]);
        System.out.println(cars.length); // to know length of array you have
        System.out.println("   ");
        for (String i : cars){ // looping each
            System.out.println(i); // i as an index
        }
        System.out.println();
        int [] [] martinsArray = {{1,2,3,4}, {5,6,7,8},{2,3,5,6}};// two_dimensional array, here we have two indexes.
        for (int i = 0; i < martinsArray.length; i++) {//using loop to know the length of tha arrays
            for (int j = 0; j < martinsArray[i].length; j++) {
                System.out.println(martinsArray[i][j]);
            }
        }
        System.out.println("");
        int martins = martinsArray[1] [1];// choosing from two index, each curly braces are indexes.
        System.out.println(martins);
        String [] myArray = new String[]{"Martins", "Grace", "Adeola", "Henry", "Adewumi", "mathaias", "martha", "Samuel", " Chibuzor"};
        myArray = new String[9];
        for (String s : myArray)
            System.out.println(s);
        System.out.println();
        System.out.println(myArray.length);
        String[] colour = new String[7];
        colour[0] = "Orange";
        colour[1] = "Yellow";
        colour[2] = "Green";
        colour[3] = "black";
        colour[4] = "Blue";
        colour[5] = "white";
        colour[6] = "purple";
        for (int i = colour.length - 1; i >= 0; i--) {
            System.out.println(colour[i]);// for loop
        }
            for (String co : colour
            ) {
                System.out.println(co);// for each


            }
        }
    }
}
    //Array is a collection of items of the same data type.
    //Example: a crate of eggs, a crate of minerals.
    // It has a fixed length.



