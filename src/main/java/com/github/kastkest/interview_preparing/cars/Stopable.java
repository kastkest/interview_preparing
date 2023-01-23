package com.github.kastkest.interview_preparing.cars;

public interface Stopable {
     default void stop() {
        System.out.println("Car is stop");
    }
}
