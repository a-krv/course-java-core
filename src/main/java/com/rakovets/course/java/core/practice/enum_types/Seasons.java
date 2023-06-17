package com.rakovets.course.java.core.practice.enum_types;

public enum Seasons {
    WINTER(-50,"Это холодное время года"),
    SPRING(30, "Это теплое вреия года"),
    SUMMER(25.5,"Это теплое время года"),
    AUTUMN(-1, "Это холодное время года");

    private final double temperature;
    private final String description;

    Seasons(double temperature, String description) {
        this.temperature = temperature;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public double getTemperature() {
        return temperature;
    }
}
