package com.mohyehia.dp.behavioral.cor;

import lombok.extern.log4j.Log4j2;

public class UsernameMiddleware extends Middleware{
    @Override
    protected void stepValidation(LoginRequest loginRequest) {
        if (loginRequest.username().length() < 4){
            throw new IllegalStateException("Username should not be less than 4 characters!");
        }
        System.out.println("UsernameMiddleware :: stepValidation :: passed");
    }
}
