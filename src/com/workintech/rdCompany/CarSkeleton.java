package com.workintech.rdCompany;

public class CarSkeleton {

    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String startEngine() {
        System.out.println("class name:" + getClass().getSimpleName());
        return getName() + "engine is starting..";
    }

    public String drive() {
        System.out.println("class name:" + getClass().getSimpleName());
        runEngine(this);
        return getName() + "is driving..";
    }

    protected String runEngine(CarSkeleton carskeleton) {
        if (carskeleton instanceof ElectricCar) {
            System.out.println("the car engine starts with electric..");
            return ((ElectricCar) carskeleton).getName();
        } else if (carskeleton instanceof GasPoweredCar) {
            System.out.println("the car engine starts with gas..");
            return ((GasPoweredCar) carskeleton).getName();
        } else if (carskeleton instanceof HybridCar) {
            System.out.println("the car engine starts with both electric and gas..");
            return ((HybridCar) carskeleton).getName();
        }
        return "Unknown car type";
    }

}
