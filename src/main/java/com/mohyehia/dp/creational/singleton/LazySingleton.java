package com.mohyehia.dp.creational.singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Mohamed.Yehia
 * Date: 7/17/2020
 * Time: 3:01 PM
 */
public class LazySingleton {
    private final String[] LETTERS = {"a", "b", "c", "d", "e"};
    private final List<String> data = Arrays.asList(LETTERS);
    private static LazySingleton instance;

    private LazySingleton() {
        Collections.shuffle(data);
    }

    public static LazySingleton getInstance() {
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

    public void printData(){
        for(String s : data) {
            System.out.printf("%s ", s);
        }
        System.out.println();
    }
}
