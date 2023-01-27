package com.github.kastkest.interview_preparing;

import com.github.kastkest.interview_preparing.shapes.Circle;
import com.github.kastkest.interview_preparing.shapes.Rectangle;
import com.github.kastkest.interview_preparing.shapes.Shape;
import com.github.kastkest.interview_preparing.shapes.Triangle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person = Person.Builder.createBuilder()
                .withFirstName("Ivan")
                .withLastName("Ivanov")
                .build();

        System.out.println(person);

        List<Shape> shapes= new ArrayList<>();
        shapes.add(new Circle());
        shapes.add(new Rectangle());
        shapes.add(new Triangle());

        for (Shape shape : shapes) {
            shape.rotate();
        }
    }
}
