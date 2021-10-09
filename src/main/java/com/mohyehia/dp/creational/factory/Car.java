package com.mohyehia.dp.creational.factory;

public abstract class Car {
    abstract void construct();

    public Car() {
        start();
    }

    void start(){
        System.out.println("Starting the initial car!");
    }
}
