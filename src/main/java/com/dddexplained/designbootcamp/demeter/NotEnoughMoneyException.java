package com.dddexplained.designbootcamp.demeter;

public class NotEnoughMoneyException extends RuntimeException {
    public NotEnoughMoneyException() {
        super();
    }

    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
