package springManipulations.constructors;

public class Example {
	public static void main(String[] args) {
		String name = new String();

		byte[] data = {(byte) 65, (byte) 100, (byte) 101, (byte) 68, (byte) 69};
//		byte[] data2 = {Byte.parseByte("A"), Byte.parseByte("B"), Byte.parseByte("C")};
		// Must be in numbers.
		String str = new String(data,0,3);
		System.out.println("str:: "+str);

		char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
		String charA = new String(charArray);
		System.out.println(charA);

		String strA = new String("Martins");
		System.out.println(strA);

		System.out.println(data.length==5);
	}
}
