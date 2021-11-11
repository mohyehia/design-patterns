package com.mohyehia.dp.structural.adapter;

/**
 * Created by M.Yehia
 * Date: 11/11/2021
 * Time: 11:01 AM
 */
public class Car implements Vehicle{
    public void accelerate() {
        System.out.println("Car is accelerating");
    }

    public void stop() {
        System.out.println("Car is stopping");
    }

    public void makeSound() {
        System.out.println("Car is making sound");
    }
}
