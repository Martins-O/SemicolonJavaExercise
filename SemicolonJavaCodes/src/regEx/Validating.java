package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validating {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("\\d");
		Matcher matcher = pattern.matcher("889");
		System.out.println(matcher.find());
	}
}
