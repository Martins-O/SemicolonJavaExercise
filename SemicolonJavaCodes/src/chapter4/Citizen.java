package chapter4;

import java.math.BigDecimal;

public class Citizen {
    private String firstName;
    private String surname;
    private BigDecimal earnings;

    public Citizen() {}
    public Citizen(String firstName, String lastname){
        this.firstName = firstName;
        this.surname = lastname;
    }
    public Citizen(String firstName, String lastname, BigDecimal amount){
        this(firstName, lastname);
        this.earnings = amount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public BigDecimal getEarnings() {
        return earnings;
    }

    public void setEarnings(BigDecimal earnings) {
        this.earnings = earnings;
    }

}
