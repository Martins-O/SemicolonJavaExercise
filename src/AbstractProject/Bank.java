package AbstractProject;

public abstract class Bank {
    abstract int getRateOfInterest();
}
class Union extends Bank{
    @Override
    int getRateOfInterest() {
        return 10;
    }
}
class Polaris extends Bank{
    @Override
    int getRateOfInterest() {
        return 29;
    }
}

class Gtb{
    public static void main(String[] args) {
        Bank access = new Union();
        Bank acces = new Polaris();
        System.out.println("Rate of interest is: "+access.getRateOfInterest());
        System.out.println("Rate of interst is "+acces.getRateOfInterest());
    }
}
