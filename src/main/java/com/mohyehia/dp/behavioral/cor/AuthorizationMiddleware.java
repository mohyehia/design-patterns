package com.mohyehia.dp.behavioral.cor;

public class AuthorizationMiddleware extends Middleware {
    @Override
    protected void stepValidation(LoginRequest loginRequest) {
        if (!loginRequest.username().equals("admin")) {
            throw new IllegalStateException("User is not authorized to perform this action!");
        }
        System.out.println("AuthorizationMiddleware :: stepValidation :: passed");
    }
}
