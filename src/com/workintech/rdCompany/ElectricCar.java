package com.workintech.rdCompany;

public class ElectricCar extends CarSkeleton {

    private double avgKmPerLitre;
    private int cylinders;

    public ElectricCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }
}
