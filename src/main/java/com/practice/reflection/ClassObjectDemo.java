package com.practice.reflection;

/**
 * Practice: {@code .class}, {@code getClass()}, {@code Class.forName(name)}.
 */
public class ClassObjectDemo {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> fromLiteral = String.class;
        Class<?> fromObject = "hi".getClass();
        Class<?> fromName = Class.forName("java.lang.String");

        System.out.println(fromLiteral == fromObject);
        System.out.println(fromLiteral == fromName);
        System.out.println(fromLiteral.getName());
    }
}
