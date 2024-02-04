package com.mohyehia.dp.behavioral.cor;

public class Main {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("admin", "pass");
        System.out.println("Creating new login request!");
        // the chain will be as the following:-
        // RequestMiddleware => UsernameMiddleware => PasswordMiddleware => AuthorizationMiddleware
        // So, the complete flow will be like the below:-
        // Request => handlers (middlewares) => response
        Middleware requestMiddleware = new RequestMiddleware();
        requestMiddleware.linkWith(new UsernameMiddleware())
                .linkWith(new PasswordMiddleware())
                .linkWith(new AuthorizationMiddleware());
        requestMiddleware.validate(loginRequest);
        System.out.println("login data created successfully!");
    }
}
