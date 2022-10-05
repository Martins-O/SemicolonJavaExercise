package chapter3;

public class HeartRates {
    public HeartRates(String firstName, String lastName, String doB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.doB = doB;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDoB() {
        return doB;
    }

    public void setDoB(String doB) {
        this.doB = doB;
    }
    public int setMinHeartRate(){
        return 220 - getAge();
    }


    String firstName;
    String lastName;
    String doB;

    public void setAge(String age) {
       this.age = Integer.parseInt(age);
    }

    public int getAge() {
        return age;
    }

   int age;


}
