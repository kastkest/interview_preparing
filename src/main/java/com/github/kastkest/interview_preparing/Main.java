package com.github.kastkest.interview_preparing;

public class Main {
    public static void main(String[] args) {
        Person person = Person.Builder.createBuilder()
                .withFirstName("Ivan")
                .withLastName("Ivanov")
                .build();

        System.out.println(person);
    }
}
