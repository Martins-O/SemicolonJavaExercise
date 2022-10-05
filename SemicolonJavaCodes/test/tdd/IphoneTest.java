package tdd;

class IphoneTest {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        Iphone.setPrice(250);
        Iphone.getPrice();

        iphone.setColor("black");
        iphone.getColor();

        System.out.println(Iphone.getPrice());
        System.out.println(iphone.getColor());
    }

}