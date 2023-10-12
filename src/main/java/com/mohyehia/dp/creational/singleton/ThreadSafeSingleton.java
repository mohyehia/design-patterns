package com.mohyehia.dp.creational.singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;
    private static final Object lock = new Object();

    private ThreadSafeSingleton() {
    }

    public static ThreadSafeSingleton getInstance() {
        ThreadSafeSingleton threadSafeSingleton = instance;
        if (threadSafeSingleton != null) {
            return threadSafeSingleton;
        }
        synchronized (lock) {
            if (instance == null) {
                instance = new ThreadSafeSingleton();
            }
        }
        return instance;
    }
}
