package com.mohyehia.dp.structural.adapter;

/**
 * Created by M.Yehia
 * Date: 11/11/2021
 * Time: 11:02 AM
 */
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bicycle = new BicycleAdapter(new Bicycle());
        playWithVehicle(car);
        playWithVehicle(bicycle);
    }

    private static void playWithVehicle(Vehicle vehicle) {
        vehicle.accelerate();
        vehicle.makeSound();
        vehicle.stop();
        System.out.println("\n");
    }
}
