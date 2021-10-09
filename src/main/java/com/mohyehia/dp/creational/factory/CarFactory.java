package com.mohyehia.dp.creational.factory;

/**
 * Created by M.Yehia
 * Date: 10/9/2021
 * Time: 3:06 PM
 */
public class CarFactory {
    public static Car getCar(CarType carType) {
        switch (carType) {
            case BMW:
                return new BmwCar();
            case AUDI:
                return new AudiCar();
            case MERCEDES:
                return new MercedesCar();
            case TOYOTA:
                return new ToyotaCar();
            default:
                throw new IllegalStateException("CarType is not supported!");
        }
    }
}
