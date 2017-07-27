package com.sample.details;


import org.springframework.data.annotation.Id;


class Employee {
    @Id
    private String id;

    private String firstName;
    private String lastName;

    public Employee(String vijay, String abc, String xyz) {}

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }
}
