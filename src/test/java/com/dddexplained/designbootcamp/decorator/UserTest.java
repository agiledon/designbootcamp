package com.dddexplained.designbootcamp.decorator;

import org.junit.Test;

public class UserTest {
    @Test
    public void should_test() {
        User user = new User();
        user.signIn();

        System.out.println("--------");

        User logging = new LoggingDecorator(new User());
        logging.signIn();

        System.out.println("--------");

        LoggingDecorator logging1 = new LoggingDecorator(new Employee());
        AuthorizedUser security = new AuthorizedUser(logging1);
        security.signIn();
    }
}