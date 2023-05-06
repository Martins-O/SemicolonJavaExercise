package tdd.ChapterExercise;

class PetrolPurchaseTest {
    public static void main(String[] args) {
        PetrolPurchase martinsPetrol = new PetrolPurchase("Lagos", "NNPC", 24,100, 5.0);
        System.out.println("Location: " + martinsPetrol.getLocation());
        System.out.println("Petrotype: " + martinsPetrol.getPetrolType());
        System.out.println("quantity: " +martinsPetrol.getQuantity());
        System.out.println("litre price: " + martinsPetrol.getLitre());
        System.out.println("Percentage: " + martinsPetrol.getPercentage());
    }

}