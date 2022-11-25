package OOPsPractice.animal;

public class Dog implements Animal {
    private String name;
    public Dog (String name){
        this.name= name;
    }
    public void bark(){
        System.out.println("i am barking");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void eat() {
        System.out.println("ia ma eating");
    }
}
