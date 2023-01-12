package springManipulations.constructors.sample;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Tokenize {
	public static void main(String[] args) {
		StringTokenizer token = new StringTokenizer("Hello are you?");
		System.out.println((token.countTokens()));
		System.out.println(token.nextToken().charAt(2));
		System.out.println(Arrays.toString(token.asIterator().toString().getBytes()));
		System.out.println(token.nextElement().hashCode());
		System.out.println(token.hasMoreElements());
		System.out.println(token.hasMoreTokens());
	}
}
