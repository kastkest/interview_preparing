package com.github.kastkest.interview_preparing.h1;

import com.github.kastkest.interview_preparing.h1.shapes.Circle;
import com.github.kastkest.interview_preparing.h1.shapes.Rectangle;
import com.github.kastkest.interview_preparing.h1.shapes.Shape;
import com.github.kastkest.interview_preparing.h1.shapes.Triangle;

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
