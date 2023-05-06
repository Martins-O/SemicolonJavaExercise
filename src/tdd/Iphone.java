package tdd;

public class Iphone {
   private static double price;
   private String color;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void setPrice( double price){
       if(price > 0)
           Iphone.price = price;
    }
    public static double getPrice(){
        return Iphone.price;
    }
}
