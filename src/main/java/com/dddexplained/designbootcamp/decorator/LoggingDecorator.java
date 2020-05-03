package com.dddexplained.designbootcamp.decorator;

import java.time.LocalDate;

public class LoggingDecorator extends User {
    private User user;

    public LoggingDecorator(User user) {
        this.user = user;
    }

    @Override
    public void signIn() {
        logging(LocalDate.now().toString());
        this.user.signIn();
    }

    private void logging(String message) {
        System.out.println(message);
    }
}
