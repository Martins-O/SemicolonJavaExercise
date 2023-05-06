package OOPsPractice.animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog("Goat");
        System.out.println(animal.getName());
        Dog dog = new Dog("johnson");
        System.out.println(dog.getName());
        dog.bark();


        Animal dog2 = new Dog("dog 2");
        dog2 = new Goat("meee");


    }
}
