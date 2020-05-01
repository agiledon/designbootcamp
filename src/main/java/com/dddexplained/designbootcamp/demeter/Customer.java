package com.dddexplained.designbootcamp.demeter;

public class Customer {
    private String firstName;
    private String lastName;
    private Wallet myWallet;
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public Wallet getWallet(){
        return myWallet;
    }

    public Customer(String firstName, String lastName) {
        this(firstName, lastName, new Wallet());
    }

    public Customer(String firstName, String lastName, Wallet myWallet) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.myWallet = myWallet;
    }
}
