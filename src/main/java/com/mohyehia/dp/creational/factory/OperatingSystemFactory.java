package com.mohyehia.dp.creational.factory;

public class OperatingSystemFactory {
    private OperatingSystemFactory() {

    }

    public OperatingSystem getInstance(OperatingSystemType operatingSystemType, String version, String arch) {
        return switch (operatingSystemType) {
            case LINUX -> new LinuxOperatingSystem(version, arch);
            case WINDOWS -> new WindowsOperatingSystem(version, arch);
            default -> throw new IllegalStateException("Unsupported operating system type!");
        };
    }
}
