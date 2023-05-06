package tdd.ChapterExercise;

//(Class PetrolPurchase) Create a class called PetrolPurchase to represent information
// about the petrol you purchase. The class should include five pieces of information in the form of instance variables—the station’s location (type String), the type of petrol (type String), the quantity (type int) of the purchase in liters, the price per liter (double), and the percentage discount
//(double). Your class should have a constructor that initializes the five instance variables. Provide a
//set and a get method for each instance variable. In addition, provide a method named getPurchaseAmount that calculates the net purchase amount (i.e., multiplies the quantity by the price per liter)
//minus the discount, then returns the net amount you had to pay as a double value. Write an application class named Petrol that demonstrates the capabilities of class PetrolPurchase
public class PetrolPurchase {
    private String location;
    private String petrolType;
    private int quantity;
    private int litre;
    private double percentage;

    public PetrolPurchase(String location, String petrolType, int quantity, int litre, double percentage){
      this.petrolType = petrolType;
      this.location = location;
      this.litre = litre;
      this.percentage = percentage;
      this.quantity = quantity;

    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getLitre() {
        return litre;
    }

    public void setLitre(int litre) {
        this.litre = litre;
    }

    public double getPercentage() {
        return quantity * litre * (- percentage / 100);
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
