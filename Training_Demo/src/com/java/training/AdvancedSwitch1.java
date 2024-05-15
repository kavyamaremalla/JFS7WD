package com.java.training;

public class AdvancedSwitch1 {

    public enum DayOfWeek {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
    }

    public static void main(String[] args) { //From Java 12 & 13
        DayOfWeek dayOfWeek = DayOfWeek.Monday;
        int x = switch (dayOfWeek) {
            case Monday : yield 1;
            case Tuesday: yield 2;
            case Wednesday : yield 3;
            default: yield 0;
        };

        int y = switch (dayOfWeek) {
            case Monday -> 1;
            case Tuesday -> 2;
            case Wednesday -> 3;
            default -> 0;
        };
        System.out.println("y = " + y);
    }
}
