package com.practice.java7;

import java.io.IOException;
import java.io.StringReader;
import java.io.BufferedReader;

/**
 * Practice: try-with-resources (Java 7+) — auto-close resources.
 */
public class TryWithResourcesDemo {

    public static void main(String[] args) throws IOException {
        String data = "line1\nline2\n";
        try (BufferedReader reader = new BufferedReader(new StringReader(data))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
