package com.chapter8;

import java.util.Date;

public class Employee {
    private final String firstName;
    private final String lastName;
    private final Date birtDate;
    private final Date hireDate;

    public Employee(String firstName, String lastName, Date birtDate, Date hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birtDate = birtDate;
        this.hireDate = hireDate;
    }
    public String toString(){
        return String.format("%s, %s Hired: %s Birthday: %s", lastName , firstName, hireDate, birtDate);
    }

    public static void main(String[] args) {
        Date birth = new Date(1949, 7, 24);
        Date hire = new Date(3, 12, 1988);
        Employee employee = new Employee("Bob", "Blue", birth, hire);
        System.out.println(employee);
    }
}
