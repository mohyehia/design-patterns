package com.mohyehia.dp.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Client {
    public static void main(String[] args) throws Exception {
//        performSerialization();
        usingReflection();
    }

    private static void performSerialization() throws IOException {
        Singleton singleton = Singleton.getInstance();
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.obj"))) {
            objectOutputStream.writeObject(singleton);
        } catch (Exception e){
            e.printStackTrace();
        }
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.obj"))) {
            Singleton deserializedObject = (Singleton) objectInputStream.readObject();
            System.out.println("singleton =>" + singleton.hashCode());
            System.out.println("deserializedObject =>" + deserializedObject.hashCode());
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void usingReflection() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<?>[] declaredConstructors = Singleton.class.getDeclaredConstructors();
        // this will return the only constructor at the Singleton class as there is only one constructor
        Constructor<?> constructor = declaredConstructors[0];
        // modify the accessibility of the constructor so that we can call it
        constructor.setAccessible(true);
        Singleton firstSingleton = (Singleton) constructor.newInstance();
        Singleton singleton = Singleton.getInstance();
        System.out.println("firstSingleton from reflection =>" + firstSingleton.hashCode());
        System.out.println("singleton from class =>" + singleton.hashCode());
        // we can fix the above issue by using an enum singleton
        EnumSingleton.INSTANCE.doSomething();
    }
}
