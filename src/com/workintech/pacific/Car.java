package com.workintech.pacific;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }


    public boolean getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public void setEngine(Boolean engine) {
        this.engine = engine;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String startEngine() {
        System.out.println("Class name: " + getClass().getSimpleName());
        return "the car's engine is starting..";
    }

    public String accelerate() {
        System.out.println("Class name: " + getClass().getSimpleName());
        return "the car is accelerating..";
    }

    public String brake() {
        System.out.println("Class name: " + getClass().getSimpleName());
        return "the car is braking..";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return engine == car.engine && cylinders == car.cylinders && wheels == car.wheels && Objects.equals(name, car.name);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Name:" + getName() + "\n");
        builder.append("Cylinders:" + getCylinders() + "\n");
        return builder.toString();
    }
}
