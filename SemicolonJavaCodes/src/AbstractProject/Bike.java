package AbstractProject;

public abstract class Bike {
    Bike(){
        System.out.println("bike is created");
    }
    abstract void run();
    void changeGear(){
        System.out.println("gear Change");
    }
}
class Honda extends Bike {
    void run(){
        System.out.println("running safely");
    }
}
class Bike2{
    public static void main(String[] args) {
        Bike bi = new Honda();
        bi.run();
        bi.changeGear();
    }
}
