package com.practice.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * Practice: java.time API (Java 8) — LocalDate, LocalDateTime, Period, formatting.
 * TODO: ZonedDateTime; Duration between two instants; isBefore/isAfter.
 */
public class DateTimeApiDemo {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate nextWeek = today.plusWeeks(1);
        Period age = Period.between(LocalDate.of(1990, 1, 1), today);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        System.out.println("today: " + today.format(fmt));
        System.out.println("next week: " + nextWeek);
        System.out.println("period years: " + age.getYears());
        System.out.println(LocalDateTime.now());
    }
}
