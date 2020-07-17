package com.mohyehia.dp.creational.singleton;

/**
 * Created by Mohamed.Yehia
 * Date: 7/17/2020
 * Time: 3:07 PM
 */
public class Main {
    public static void main(String[] args) {
        // testing for the LazySingleton
        LazySingleton lazySingleton = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        lazySingleton.printData();
        lazySingleton2.printData();
        System.out.println(lazySingleton.hashCode());
        System.out.println(lazySingleton2.hashCode());

        // testing for the ThreadSafeSingleton
        new DataPrinter().start();
        new DataPrinter().start();
    }
}

class DataPrinter extends Thread{
    @Override
    public void run() {
        ThreadSafeSingleton.getInstance().printData();
    }
}
