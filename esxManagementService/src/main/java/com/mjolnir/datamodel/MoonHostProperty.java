package com.mjolnir.datamodel;

public enum MoonHostProperty {
    STATUS("Status"),
    OWNER("Owner"),
    RELEASE("Release");

    private final String name;

    MoonHostProperty(String name) {
        this.name = name;
    }
}
