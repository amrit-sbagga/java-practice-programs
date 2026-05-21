package com.practice;

/**
 * Default entry when running {@code mvn exec:java}.
 * Change the class you invoke, or run any exercise's {@code main} directly from the IDE.
 */
public final class Runner {

    private Runner() {
    }

    public static void main(String[] args) {
        System.out.println("Java Practice Programs");
        System.out.println("Run a specific class, e.g.:");
        System.out.println("  mvn -q exec:java -Dexec.mainClass=com.practice.basic.oops.InheritanceDemo");
        System.out.println("See README.md for the full program list.");
    }
}
