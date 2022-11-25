package AbstractProject;

public abstract class Shape {
    abstract void draw();
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing rectangle");
    }
}
class Circle1 extends Shape{
    void draw(){
        System.out.println("Drawing circle");
    }
}
class Abstraction{
    public static void main(String[] args) {
        Shape hape = new Circle1();
        hape.draw();
        Shape hap = new Rectangle();
        hap.draw();
    }
}
