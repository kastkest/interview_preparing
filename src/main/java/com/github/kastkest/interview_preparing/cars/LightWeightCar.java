package com.github.kastkest.interview_preparing.cars;

public class LightWeightCar extends Car implements Moveable{
    @Override
    void open() {
        System.out.println("Car is open");
    }

}
