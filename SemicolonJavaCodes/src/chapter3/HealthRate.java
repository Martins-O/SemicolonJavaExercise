package chapter3;

import java.time.LocalDate;

public class HealthRate {
    private String firstName;
    private String lastName;
    private String gender;
    private String doB;
    private double weight;
    private double height;
    private int measurementSystem;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDoB() {
        return doB;
    }

    public void setDoB(String doB) {
        this.doB = doB;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public HealthRate() {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.doB = doB;
        this.weight = weight;
        this.height = height;
        this.measurementSystem = measurementSystem;
    }

    private double BMI;
    public void setBMI(){
        this.BMI = BMI;
    }
    public double getBMI(){
        return BMI = weight / (height * height);
    }


    private double calculateImperial() {
        return ((weight * 700) / (height * height));
    }

    private double calculateMetric() {
        return weight / (height * height);
    }

    public int getMaxHeartRate() {
        return 220 - getAge();
    }

    public int getAge() {
//        return 0;
        LocalDate today = LocalDate.now();

        Long todayEpoch = today.toEpochDay();
        LocalDate dob = LocalDate.parse(doB);
        long dobEpoch = dob.toEpochDay();

        return (int) (todayEpoch - dobEpoch) / 365;
    }

    public String getTargetHeartRate() {
        return String.format("%.0f - %.0f",
                getMaxHeartRate() * 0.5, getMaxHeartRate() * 0.85);

        }

    }

