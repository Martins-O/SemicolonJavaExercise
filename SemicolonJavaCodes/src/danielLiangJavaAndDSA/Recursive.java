package danielLiangJavaAndDSA;

public class Recursive {

	public static int factorial(int number){
		if(number == 0) {
			return 1;
		}
		else return number * factorial(number - 1);
	}

	public static void main(String[] args) {
		int num = 5;
		System.out.println(factorial(num));

	}
}
