package chibuzorAssignment;

public class NumberTriangle {
    public static void main(String[] args) {
        int row =2, k = 0;

        for (int i = 1; i <= row; i++, k = 0) {
            for (int j = 1; j <= row - i ; j++) {
                System.out.print(" ");
                while(k != 2 * i - 1){
                    System.out.print(" 1 ");
                    ++k;
            }

//                System.out.print("2 ");
//                System.out.print("3 ");
//                System.out.print("4 ");
//                System.out.print("5 ");

            }
            System.out.println();

        }
//        for (int count = 1; count > 0; count--) {
//            for (int index = 1; index < count - 1; index++)
//                System.out.print(" ");
//            for (int star = 1; star > count - 1; star--)
//                System.out.print("     1 ");
//            System.out.println();
//            for (int star = 3; star > count - 1; star--)
//                System.out.print("    2 ");
//                System.out.println();
//            for (int star = 5; star > count - 1; star--)
//                System.out.print("   3 ");
//                System.out.println();
//            for (int star = 7; star > count - 1; star--)
//                System.out.print("  4 ");
//                System.out.println();for (int star = 9; star > count - 1; star--)
//                System.out.print(" 5 ");
//                System.out.println();
//        }
    }
}


