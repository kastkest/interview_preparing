package com.github.kastkest.interview_preparing.h1.cars;

public interface Moveable {
    default void move() {
        System.out.println("Car is moving");
    }

    ;
}
