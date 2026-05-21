package com.practice.java8;

/**
 * Practice: Interface default and static methods (Java 8+).
 */
interface Calculator {
    int add(int a, int b);

    default int addTwice(int a, int b) {
        return add(a, b) + add(a, b);
    }

    static Calculator simple() {
        return (a, b) -> a + b;
    }
}

public class DefaultStaticInterfaceDemo {

    public static void main(String[] args) {
        Calculator calc = Calculator.simple();
        System.out.println(calc.add(2, 3));
        System.out.println(calc.addTwice(2, 3));
    }
}
