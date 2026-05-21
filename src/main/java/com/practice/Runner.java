package com.practice;

/**
 * Optional entry point. Prefer running classes directly — see README.md.
 */
public final class Runner {

    private Runner() {
    }

    public static void main(String[] args) {
        System.out.println("Java Practice Programs");
        System.out.println("Topic demos:");
        System.out.println("  mvn -q compile");
        System.out.println("  java -cp target/classes com.practice.basic.oops.InheritanceDemo");
        System.out.println("Interview drills (practice-programs/):");
        System.out.println("  mvn -q compile");
        System.out.println("  java -cp target/classes AnagramCheck");
        System.out.println("See README.md for the full program list.");
    }
}
