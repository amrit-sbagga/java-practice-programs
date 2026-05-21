package com.practice.string;

/**
 * Practice: Literal pool, {@code intern()}, {@code ==} vs {@code equals}.
 */
public class StringPoolDemo {

    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        String c = new String("hello");
        String d = c.intern();

        System.out.println("a == b: " + (a == b));
        System.out.println("a == c: " + (a == c));
        System.out.println("a == d: " + (a == d));
        System.out.println("a.equals(c): " + a.equals(c));
    }
}
