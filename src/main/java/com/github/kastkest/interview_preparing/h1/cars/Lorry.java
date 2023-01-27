package com.github.kastkest.interview_preparing.h1.cars;

public class Lorry extends Car implements Stopable, Moveable {


    @Override
    void open() {
        System.out.println("Car is open");
    }
}
