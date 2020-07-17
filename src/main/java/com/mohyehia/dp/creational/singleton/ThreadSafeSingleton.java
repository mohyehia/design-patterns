package com.mohyehia.dp.creational.singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Mohamed.Yehia
 * Date: 7/17/2020
 * Time: 3:22 PM
 */
public class ThreadSafeSingleton {
    private final String[] LETTERS = {"a", "b", "c", "d", "e"};
    private final List<String> data = Arrays.asList(LETTERS);
    private static volatile ThreadSafeSingleton instance;
    // just for testing the delay
    private static boolean delayMe = true;

    private ThreadSafeSingleton() {
        Collections.shuffle(data);
    }

    public static ThreadSafeSingleton getInstance(){
        if(instance == null){
            synchronized (ThreadSafeSingleton.class){
                if(instance == null){
                    if(delayMe){
                        delayMe = false;
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    instance = new ThreadSafeSingleton();
                }
            }
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
