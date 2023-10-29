package com.mohyehia.dp.creational.factory;

public class WindowsOperatingSystem extends OperatingSystem {
    public WindowsOperatingSystem(String version, String arch) {
        super(version, arch);
    }

    @Override
    public void changeDir(String dir) {
        System.out.println("Changing the directory from windows for this dir =>" + dir + " using this command: cd");
    }

    @Override
    public void removeDir(String dir) {
        System.out.println("Removing the directory from windows for this dir =>" + dir + " using this command: rm");
    }
}
