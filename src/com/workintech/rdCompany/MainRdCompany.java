package com.workintech.rdCompany;


public class MainRdCompany {

    public static void main(String[] args) {


        CarSkeleton car1 = new ElectricCar("tesla", "this is a tesla", 150, 10);
        System.out.println(car1.getName());
        CarSkeleton car2 = new GasPoweredCar("bmw", "this is a bmw", 150, 8);
        System.out.println(car2.getName());

        car1.runEngine(car1);
        car2.runEngine(car2);

        car1.drive();
        car2.drive();

        System.out.println("***********");
        CarSkeleton carSkeleton = new CarSkeleton("skeleton", "this is a skeleton");
        System.out.println(carSkeleton.runEngine(carSkeleton)); // unknown type (else)
        carSkeleton.drive();

        System.out.println("***********");

        ElectricCar electricCar = new ElectricCar("mercedes", "this is a mercedes", 120, 10);
        System.out.println(electricCar.runEngine(carSkeleton));
        electricCar.drive();

    }

}
