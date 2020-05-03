package com.dddexplained.designbootcamp.decorator;

public class AuthorizedUser extends User {
    private User user;

    public AuthorizedUser(User user) {
        this.user = user;
    }

    @Override
    public void signIn() {
        if (!authorized()) {
            throw new NotAuthorizedUserException();
        }
        this.user.signIn();
    }

    private boolean authorized() {
        System.out.println("authorized");
        return true;
    }
}
