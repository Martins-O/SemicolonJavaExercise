package electronicStore;

public class Address {
    private String houseNumber;
    private String streetName;
    private String city;
    private String state;
    private String country;

    public Address(String houseNumber, String streetName, String city, String state, String country) {
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.country = country;
    }
}
