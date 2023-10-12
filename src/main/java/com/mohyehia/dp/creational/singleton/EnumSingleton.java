package com.mohyehia.dp.creational.singleton;

public enum EnumSingleton {
    INSTANCE;

    private EnumSingleton(){
        // initialization here!

    }

    public void doSomething(){
        System.out.println("EnumSingleton is working!");
    }
}
