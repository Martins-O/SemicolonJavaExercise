package diary;

public class BeansMessenger {
    public Beans buyBeans(int amount, int numberOfSpoons, boolean moneyIsFake, boolean withOmiEwa){
        verifyMoney(moneyIsFake);
        verifyValidPrice(amount,numberOfSpoons);
        return buyBeans(numberOfSpoons, withOmiEwa);
    }

    private Beans buyBeans(int numberOfSpoons, boolean withOmiEwa){
        return new Beans(numberOfSpoons, withOmiEwa);
    }

    private void verifyValidPrice(int amount, int numberOfSpoons) {
        int pricePerSpoon = 50;
        if (numberOfSpoons * pricePerSpoon > amount) throw new IllegalArgumentException("You dont enough money");
    }

    private boolean verifyMoney(boolean moneyIsFake){
        return moneyIsFake;
    }
}
