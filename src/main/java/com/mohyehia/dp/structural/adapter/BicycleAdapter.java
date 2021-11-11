package com.mohyehia.dp.structural.adapter;

/**
 * Created by M.Yehia
 * Date: 11/11/2021
 * Time: 11:07 AM
 */
public class BicycleAdapter implements Vehicle{
    Bicycle bicycle;
    public BicycleAdapter(Bicycle bicycle){
        this.bicycle = bicycle;
    }
    public void accelerate() {
        bicycle.tryPedal();
    }

    public void stop() {
        bicycle.makeBreak();
    }

    public void makeSound() {
        bicycle.beep();
    }
}
