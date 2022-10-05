package chapter3;

public class HealthRecord {


    public HealthRecord(String firstName, String lastName, String doB, String gender, int height, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.doB = doB;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    String lastName;
    String doB;
    String gender;
    int height;
    int weight;
    String firstName;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}
