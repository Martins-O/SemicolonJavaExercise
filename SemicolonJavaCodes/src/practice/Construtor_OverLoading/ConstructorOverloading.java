package practice.Construtor_OverLoading;

//    in Java, we can overload constructors like methods.
//        The constructor overloading can be defined as the concept of having more than
//        one constructor with different parameters so that every constructor can perform a different task.

public class ConstructorOverloading {
    int id;
    String name;

    ConstructorOverloading(){
        System.out.println("This is a default constructor ->");
    }
    ConstructorOverloading(int i, String n){
        id = i;
        name = n;
    }

    public static void main(String[] args) {
        ConstructorOverloading co = new ConstructorOverloading();
        System.out.println("Default Constructor Values: \n");
        System.out.println("Constructor id: " +co.id+ "\nConstructor Name: " +co.name);

        System.out.println();
        System.out.println("Parametized Constructor Values\n ->");
        ConstructorOverloading ct = new ConstructorOverloading(10, "Martins");
        System.out.println("Constructor id: " +ct.id+ "\nConstructor Name: " +ct.name);
    }
}
