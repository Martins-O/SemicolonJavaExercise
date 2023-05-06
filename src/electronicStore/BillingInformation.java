package electronicStore;

public class BillingInformation {
    private String phoneNumber;
    private String firstName;
    private String lastName;
    private Address deliveyAddress;
    private CreditCardInformation creditCard;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public Address getDeliveyAddress() {
        return deliveyAddress;
    }

    public void setDeliveyAddress(Address deliveyAddress) {
        this.deliveyAddress = deliveyAddress;
    }

    public CreditCardInformation getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCardInformation creditCard) {
        this.creditCard = creditCard;
    }
}