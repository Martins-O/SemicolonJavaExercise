package OOPsPractice.Polymorphism;

public class Goat extends Animal{
    @Override
    public void speak() {
        System.out.println("Bleat");
    }
    public void sleep(){
        System.out.println("Sleep like a goat");
    }
}
