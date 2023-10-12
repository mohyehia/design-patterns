package com.mohyehia.dp.creational.singleton;

import java.io.Serial;
import java.io.Serializable;

public class Singleton implements Serializable {
    private static Singleton instance;

    private Singleton() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    /*
    This method is for the deserialization of the singleton class inorder to notify the JVM to call this method
    and return the same instance instead of creating new instance of the object
     */
    @Serial
    protected Object readResolve() {
        return instance;
    }
}
