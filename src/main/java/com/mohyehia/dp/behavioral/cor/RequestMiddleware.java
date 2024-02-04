package com.mohyehia.dp.behavioral.cor;

public class RequestMiddleware extends Middleware {

    @Override
    protected void stepValidation(LoginRequest loginRequest) {
        if (loginRequest == null || loginRequest.username().isEmpty() || loginRequest.password().isEmpty()) {
            throw new IllegalStateException("Username & Password should not be null!");
        }
        System.out.println("RequestMiddleware :: stepValidation :: passed");
    }
}
