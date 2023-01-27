package com.github.kastkest.interview_preparing.cars;

public interface Moveable {
    default void move() {
        System.out.println("Car is moving");
    }

    ;
}
