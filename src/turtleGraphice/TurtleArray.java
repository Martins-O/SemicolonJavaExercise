package turtleGraphice;


public class TurtleArray {
    public static void getTurtle() {
        int[][] turtle = {{1, 0, 0, 1, 1, 1, 0, 0, 0, 0,}, {1, 0, 0, 1, 1, 1, 0, 0, 0, 0,},
                {1, 0, 0, 1, 1, 1, 0, 0, 0, 0,}, {1, 0, 0, 1, 1, 1, 0, 0, 0, 0,},
                {1, 0, 0, 1, 1, 1, 0, 0, 0, 0,}, {1, 0, 0, 1, 1, 1, 0, 0, 0, 0,},
                {1, 0, 0, 1, 1, 1, 0, 0, 0, 0,}, {1, 0, 0, 1, 1, 1, 0, 0, 0, 0,},
                {1, 0, 0, 1, 1, 1, 0, 0, 0, 0,}, {1, 0, 0, 1, 1, 1, 0, 0, 0, 0,}};
        for (int[] turt : turtle) {
            for (int turtl : turt) {
                if (turtl == 0) {
                    System.out.print("🥰"+" ");
                }else
                System.out.print(turtl+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        getTurtle();
    }

}
