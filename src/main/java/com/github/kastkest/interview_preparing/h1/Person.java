package com.github.kastkest.interview_preparing.h1;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static class Builder {
        private Person person;

        public Builder() {
            this.person = new Person();
        }

        public static Builder createBuilder() {
            return new Builder();
        }

        public Builder withFirstName(String firstName) {
            this.person.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.person.lastName = lastName;
            return this;
        }

        public Builder withMiddleName(String middleName) {
            this.person.middleName = middleName;
            return this;
        }

        public Builder withCountry(String country) {
            this.person.country = country;
            return this;
        }

        public Builder withAddress(String address) {
            this.person.address = address;
            return this;
        }

        public Builder withPhone(String phone) {
            this.person.phone = phone;
            return this;
        }

        public Builder withAge(int age) {
            this.person.age = age;
            return this;
        }

        public Builder withGender(String gender) {
            this.person.gender = gender;
            return this;
        }


        public Person build() {
            return this.person;
        }
    }
}
