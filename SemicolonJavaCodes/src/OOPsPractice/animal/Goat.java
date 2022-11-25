package OOPsPractice.animal;

public class Goat implements Animal {
    private String name;
    public Goat(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void eat() {
        System.out.println("I am eating");
    }
}
