package com.workintech.pacific;

public class MainPacific {

    public static void main(String[] args) {


        System.out.println("*****One car********");
        Car car = new Car(8, "One car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        System.out.println("*****Mitsubishi********");
        Car mitsubishi = new Mitsubishi(8, "eclipse cross");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        System.out.println("*****Ford********");
        Car ford = new Ford(8, "fiesta");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        System.out.println("*****Holden********");
        Car holden = new Holden(8, "commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());


    }

}
