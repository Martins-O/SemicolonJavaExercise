package phoneContact;

import electronicStore.Address;

public class Record {
    private String name;
    private Address address;
    private String houseNo;
    private String telephone;
    private String email;

    public Record() {
    }

    public Record(String name, Address address, String telephone, String email) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
    }

    public Record(String comName, String houseNo, String num, String mail) {
        this.name = comName;
        this.houseNo = houseNo;
        this.telephone = num;
        this.email = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Records{"
                + "Contact Name : " + name + " Address = " + address
                + " ContactNumber =" + telephone + " Email Address : " + email + '}';
    }
}
