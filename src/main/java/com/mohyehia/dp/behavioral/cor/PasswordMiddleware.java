package com.mohyehia.dp.behavioral.cor;

public class PasswordMiddleware extends Middleware{
    @Override
    protected void stepValidation(LoginRequest loginRequest) {
        if (loginRequest.password().length() < 8){
            throw new IllegalStateException("Password should not be less than 8 characters!");
        }
        System.out.println("PasswordMiddleware :: stepValidation :: passed");
    }
}
