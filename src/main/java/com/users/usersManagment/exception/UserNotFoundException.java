package com.users.usersManagment.exception;

public class UserNotFoundException  extends RuntimeException{

    public UserNotFoundException(Long id)
    {
        super("Couldn't find the user with id "+ id);
    }

}
