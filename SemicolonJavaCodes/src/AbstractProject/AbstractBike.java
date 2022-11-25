package AbstractProject;


import Bike.Bike;

public abstract class  AbstractBike {
    abstract void run();
    abstract void gear();
}
class Honda4 extends AbstractBike{
    @Override
    void run() {
        System.out.println("running safely");
    }

    @Override
    void gear() {
        System.out.println("Increase to gear four:");
    }

    public static void main(String[] args) {
        AbstractBike bike = new Honda4();
        bike.run();
        bike.gear();
    }
}
