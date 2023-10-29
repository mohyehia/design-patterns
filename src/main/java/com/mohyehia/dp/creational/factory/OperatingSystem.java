package com.mohyehia.dp.creational.factory;

public abstract class OperatingSystem {
    private String version;
    private String arch;

    protected OperatingSystem(String version, String arch) {
        this.version = version;
        this.arch = arch;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    public abstract void changeDir(String dir);

    public abstract void removeDir(String dir);
}
