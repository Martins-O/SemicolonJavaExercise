package OOPsPractice;

public class Natives {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;
    private String address;

    public Natives(Human human){
        firstName = human.getFirstName();
        lastName = human.getLastName();
        if (human.getPhoneNumber().length() != 11)
            throw new IllegalArgumentException("Invalid phone number entered!");
        phoneNumber = human.getPhoneNumber();
        emailAddress = human.getEmailAddress();
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getAddress() {
        return address;
    }


}
