package com.mohyehia.dp.behavioral.cor;

public abstract class Middleware {
    private Middleware next;

    protected Middleware linkWith(Middleware next) {
        this.next = next;
        return next;
    }

    protected abstract void stepValidation(LoginRequest loginRequest);

    protected void validate(LoginRequest loginRequest) {
        stepValidation(loginRequest);
        if (next != null) {
            next.validate(loginRequest);
        }
    }

}
