package com.dddexplained.designbootcamp.demeter;

public class Wallet {
    private float value;

    public Wallet() {
        this(0f);
    }

    public Wallet(float value) {
        this.value = value;
    }

    public float getTotalMoney() {
        return value;
    }

    public void addMoney(float deposit) {
        value += deposit;
    }
    public void subtractMoney(float debit) {
        value -= debit;
    }
}
