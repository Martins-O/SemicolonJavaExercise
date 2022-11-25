package danielLiangJavaAndDSA;

public class Circle {
    private double radius = 1;
    private static  int numberOfObjects = 0;

    public Circle(){
        numberOfObjects++;
        System.out.println(numberOfObjects);
    }
    public Circle(double newRadius){
        radius = newRadius;
        numberOfObjects++;
        System.out.println(numberOfObjects);
        System.out.println(newRadius);
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double newRadius){
        radius = (newRadius >= 0) ? newRadius : 0;
    }
    public static int getNumberOfObjects(){
        return numberOfObjects;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
}
