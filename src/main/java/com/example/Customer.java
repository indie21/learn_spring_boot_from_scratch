package com.example;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    protected Customer() {}

    public Customer(String firstname, String lastName) {
        this.firstName = firstName;
        this.lastname = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                             "Customer[id=%d, firstName='%s', lastName='%s']",
                             id, firstName, lastName);
    }

}
