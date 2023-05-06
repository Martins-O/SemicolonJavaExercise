package OOPsPractice.Polymorphism;

import OOPsPractice.Interface.Movable;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    public void polymorphismTest(){
        Animal aja = new Dog();
        aja.speak();
        Animal aja1 = new Cat();
        aja1.speak();
        Animal aja2 = new Goat();
        aja2.speak();
        Movable movable = new Goat();
        Dog dog = new Dog();
    }

}