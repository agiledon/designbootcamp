package com.dddexplained.designbootcamp.decorator;

import org.junit.Test;

public class UserTest {
    @Test
    public void user_sign_in() {
        User user = new User();
        user.signIn();
    }

    @Test
    public void user_sign_in_with_logging() {
        User logging = new LoggingDecorator(new User());
        logging.signIn();
    }

    @Test
    public void employee_sign_in_with_logging_and_authorized() {
        User security = new AuthorizedUser(new LoggingDecorator(new Employee()));
        security.signIn();
    }
}