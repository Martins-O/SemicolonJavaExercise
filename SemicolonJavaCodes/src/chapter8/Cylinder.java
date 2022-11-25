package chapter8;
//todo(Cylinder Class) Create a class Cylinder with attributes radius and height, each of
//todo        which has a default value of 1. Provide a method that calculates the cylinders’ volume, which
//todo        is pi multiplied by the square of the radius multiplied by the height. It has set and get meth
//todo        ods for both radius and height. The set method should verify that radius and height are pos
//todo        native numbers. Write a program to test class Cylinder.

// class = radius and height = 1
//methods cylinder volume (math.p1 * math.sqr(radius, 2) * height.
// get and set = radius and height
// exceptional handling for both radius and height.

public class Cylinder {
    private double radius = 1.0;
    private double height = 1.0;

    public Cylinder(double radius, double height) {
        isValidating(radius, height);
        this.radius = radius;
        this.height = height;
    }
    double cylinderVolume(int volume){
        volume = (int) ((int)Math.PI * Math.pow(radius, 2) * height);
        return volume;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    void isValidatingRadius(double radius){
        boolean isRadius = radius < 1;
        if (isRadius) throw new IllegalArgumentException("Invalid radius");
    }
    void isValidatingHeight(double height){
        boolean isHeight = height < 1;
        if (isHeight) throw new IllegalArgumentException("Invalid height");
    }
    void isValidating(double radius, double height){
        isValidatingHeight(height);
        isValidatingRadius(radius);
    }
}
