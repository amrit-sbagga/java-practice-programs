package com.practice.serialization;

import java.io.*;

/**
 * Practice: {@code Serializable}, Object streams, {@code serialVersionUID}.
 * TODO: Serialize/deserialize a Person; print before and after.
 */
public class SerializableDemo {

    public static void main(String[] args) {
        // Your code here
    }

    /** Example model — implement fully in your exercise. */
    public static class Person implements Serializable {
        @Serial
        private static final long serialVersionUID = 1L;
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + "}";
        }
    }
}
