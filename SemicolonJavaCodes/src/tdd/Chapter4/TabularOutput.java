package tdd.Chapter4;

public class TabularOutput {
    public static void main(String[] args) {
        System.out.printf("%s%6s%6s%6s%n", "N1", "N2", "N3", "N4");
        for (int i = 0; i <= 5; i++) {
            System.out.printf("%d%6d%6d%6d%n", i,(int)Math.pow(i, 2), (int)Math.pow(i, 3), (int)Math.pow(i, 4));
        }
    }
}