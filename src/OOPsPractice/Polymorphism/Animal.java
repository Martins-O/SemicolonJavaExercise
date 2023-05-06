package OOPsPractice.Polymorphism;
//principle of polymorphism.

import OOPsPractice.Interface.Movable;

public class Animal implements Movable {
    public void speak(){
        System.out.println("Speaking");
    }

    @Override
    public void move() {
        System.out.println("moving like animal");
    }
}
