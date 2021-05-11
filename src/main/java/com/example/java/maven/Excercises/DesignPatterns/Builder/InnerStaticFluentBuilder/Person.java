package com.example.java.maven.Excercises.DesignPatterns.Builder.InnerStaticFluentBuilder;

public class Person {
    private final String name;
    private final String surname;
    private final int age;
    private final boolean isAlive;

    private Person(String name, String surname, int age, boolean isAlive) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isAlive = isAlive;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public static final class Builder {
        private String name;
        private String surname;
        private int age;
        private boolean isAlive;

        public Builder name(String name) {
            if (name == null || name.length() < 1) {
                throw new IllegalArgumentException("Name can not be null or empty");
            }
            this.name = name;
            return this;
        }

        public Builder surname(String surname) {
            if (surname == null || surname.length() < 1) {
                throw new IllegalArgumentException("Surname can not be null or empty");
            }
            this.surname = surname;
            return this;
        }

        public Builder age(int age) {
            if (age < 0) {
                throw new IllegalArgumentException("Age can not be smaller than 0");
            }
            this.age = age;
            return this;
        }

        public Builder isAlive(boolean isAlive) {
            this.isAlive = isAlive;
            return this;
        }

        public Person build() {
            return new Person(name, surname, age, isAlive);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", isAlive=" + isAlive +
                '}';
    }
}
