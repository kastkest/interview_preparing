package com.github.kastkest.interview_preparing.h1.cars;

public class LightWeightCar extends Car implements Moveable{
    @Override
    void open() {
        System.out.println("Car is open");
    }

}
