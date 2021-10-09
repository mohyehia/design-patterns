package com.mohyehia.dp.creational.factory;

/**
 * Created by M.Yehia
 * Date: 10/9/2021
 * Time: 3:33 PM
 */
public class Main {
    public static void main(String[] args) {
        Car bmwCar = CarFactory.getCar(CarType.BMW);
        bmwCar.construct();

        Car audiCar = CarFactory.getCar(CarType.AUDI);
        audiCar.construct();

        Car mercedesCar = CarFactory.getCar(CarType.MERCEDES);
        mercedesCar.construct();

        Car toyotaCar = CarFactory.getCar(CarType.TOYOTA);
        toyotaCar.construct();
    }
}
