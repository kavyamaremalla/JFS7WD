package com.java.training;

public class AdvancedSwitch2 {
    public enum DayOfWeek {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
    }

    public static void main(String[] args) { //from Java 17

        int dayOfWeek = 3;

        String day = switch (dayOfWeek) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Unknown day";
        };

        System.out.println(day);
        System.out.println(day instanceof String);
    }
}
