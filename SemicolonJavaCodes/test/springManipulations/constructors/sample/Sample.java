package springManipulations.constructors.sample;

public class Sample {
	public static void main(String[] args) {
//		String text = """
//			""";
//		StringBuilder digitWithinText = new StringBuilder();
//		for(int counter = 0; counter < text.length(); counter++) {
//			char currentCharacter = text.charAt(counter);
//			if(Character.isDigit(currentCharacter)) {
//				digitWithinText.append(currentCharacter);
//			}
//
//		}
//		System.out.println(digitWithinText.toString());
		StringBuilder sb = new StringBuilder(3);
		sb.append(34);
		sb.append(22);
		sb.append("22");
		System.out.println(sb);
	}
}
