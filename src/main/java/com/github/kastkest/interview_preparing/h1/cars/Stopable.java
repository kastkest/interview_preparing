package com.github.kastkest.interview_preparing.h1.cars;

public interface Stopable {
     default void stop() {
        System.out.println("Car is stop");
    }
}
