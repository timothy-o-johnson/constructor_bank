package com.company;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
        this("Joe Black", 10_000, "joe@joe.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = "joeblack@joeblack.com";
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public double getCreditLimit() {
        System.out.println(creditLimit);
        return creditLimit;
    }

    public String getEmail() {
        System.out.println(email);
        return email;
    }
}
