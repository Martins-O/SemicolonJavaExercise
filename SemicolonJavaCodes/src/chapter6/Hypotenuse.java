package chapter6;
/*Define a method hypotenuse that calculates the hypotenuse of
a right triangle when the lengths of the other two sides are given. The method should take two
arguments of type double and return the hypotenuse as a double. Incorporate this method into an
application that reads values for side1 and side2 and performs the calculation with the hypotenuse
method. Use Math methods pow and sqrt to determine the length of the hypotenuse for each of the
triangles in Fig. 6.14. [Note: Class Math also provides method hypot to perform this calculation.]*/

public class Hypotenuse {

    public static double hypotenuse(double firstSide, double secondSide){
//        double cal = Math.hypot(firstSide, secondSide);
        double cal = Math.sqrt(Math.pow(firstSide,2) + Math.pow(secondSide,2));
        System.out.println(firstSide+"\t"+secondSide+"\t"+cal);
        return cal;
    }

    public static void main(String[] args) {
        double firstSide = 3.0;
        double secondSide = 4.0;
        hypotenuse(firstSide,secondSide);
    }
}
