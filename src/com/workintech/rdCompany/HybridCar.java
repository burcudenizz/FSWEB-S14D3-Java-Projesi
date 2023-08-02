package com.workintech.rdCompany;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int cylinders;

    private int batterySize;

    public HybridCar(String name, String description, double avgKmPerLitre, int cylinders, int batterySize) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }
}