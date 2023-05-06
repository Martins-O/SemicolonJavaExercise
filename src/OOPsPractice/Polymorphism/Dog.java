package OOPsPractice.Polymorphism;

public class Dog extends Animal{

    @Override
    public void speak() {
        System.out.println("Bark");
    }
    public void eat(){
        System.out.println("Eat bone");
    }
}
