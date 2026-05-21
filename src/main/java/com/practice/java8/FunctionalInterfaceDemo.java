package com.practice.java8;

/**
 * Practice: {@code @FunctionalInterface} — exactly one abstract method (SAM).
 * Built-in: Runnable, Comparator, Callable, and java.util.function.* package.
 */
@FunctionalInterface
interface Greeter {
    String greet(String name);

    // default/static methods allowed — still a functional interface
    default String greetLoud(String name) {
        return greet(name).toUpperCase();
    }
}

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {
        Greeter greeter = name -> "Hello, " + name;
        System.out.println(greeter.greet("Java 8"));
        System.out.println(greeter.greetLoud("lambda"));
    }
}
