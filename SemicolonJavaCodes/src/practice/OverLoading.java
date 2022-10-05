package practice;

public class OverLoading {
    public int addNumbers(int num1, int num2){
        return num1 + num2;
    }
    public double addNumbers(int num1, double num){
        return num1 + num;
    }
    public double addNumbers(double num1, double num2){
        return num1 + num2;
    }
    public double addNumbers(double num1, int num2){
        return num1 + num2;
    }

    public static void main(String[] args) {
        OverLoading overLoading = new OverLoading();
        System.out.println(" "+overLoading.addNumbers(24,34));
        System.out.println("");
        System.out.println(" "+overLoading.addNumbers(23.4, 54));
        System.out.println(" ");
        System.out.println(" "+overLoading.addNumbers(24.5, 88.9));
        System.out.println(" ");
        System.out.println(" "+overLoading.addNumbers(88, 45.4));
    }
}
