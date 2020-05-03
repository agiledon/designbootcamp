package com.dddexplained.designbootcamp.decorator;

public class Employee extends User {
    @Override
    public void signIn() {
        super.signIn();
        System.out.println("employee signIn");
    }
}
