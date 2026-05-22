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

        System.out.println("a == b: " + (a == b)); // true because both refer to the same object in the pool
        System.out.println("a == c: " + (a == c)); // false because c is a new object
        System.out.println("a == d: " + (a == d)); // false because d is a new object
        System.out.println("a.equals(c): " + a.equals(c)); // true because both refer to the different objects
    }
}
