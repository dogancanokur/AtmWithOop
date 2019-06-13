package com.dogancanokur;

public class Customer {
    private int id;
    private String name;
    private double balance;
    private String username;

    public Customer(int id, String name, double balance, String username) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
