package martinsProject;

public class StringConca {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("What is your name: ");
//        String fName = input.nextLine();
//        System.out.println("What is your name: ");
//        String lName = input.nextLine();
//
//        System.out.println(lName.charAt(2));
//
//        System.out.printf("your full name is %s %s \n%s" ,fName.concat( lName), fName.toUpperCase(),lName.trim());

        StringBuilder builder = new StringBuilder("Martins");
        StringBuilder builders = new StringBuilder(21);

        builder.ensureCapacity(33);
        builders.ensureCapacity(10);
//        builders.setLength(65);

        System.out.println(builders.length());
        System.out.println(builders.capacity());
        System.out.println(builder.capacity());
        System.out.printf(builder.toString(), builder.appendCodePoint(67));
        System.out.println();
        System.out.println(builder.reverse());

    }
}
