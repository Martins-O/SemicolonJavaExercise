package practice;

public class Chibuzor {
    private int scv;
    private static int counter;

    public Chibuzor(){
        scv = ++counter;
    }

    public static void main(String[] args) {
        Chibuzor amira = new Chibuzor();
        System.out.println(amira.scv);
        Chibuzor simi = new Chibuzor();
        System.out.println(simi.scv);
    }
}
