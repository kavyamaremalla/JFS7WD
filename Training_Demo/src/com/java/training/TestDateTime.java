package com.java.training;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TestDateTime {

    public static void main(String[] args) {
        TestDateTime testDateTime = new TestDateTime();
        testDateTime.testLocalDateTime();
    }

    public void testLocalDateTime(){

        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("Current local date time " + currentTime);

        System.out.println("Today's date " + currentTime.toLocalDate());

        System.out.println("Current time is " + currentTime.toLocalTime());

        System.out.println(currentTime.getChronology());

        System.out.println(currentTime.withDayOfMonth(10).withYear(2021));

        System.out.println(LocalDate.of(2014, Month.DECEMBER,28));

        System.out.println(LocalTime.of(22,15));

        System.out.println(LocalTime.parse("20:15:45"));

        System.out.println(ZoneId.systemDefault());

        System.out.println(ZoneId.of("Europe/Paris"));

        System.out.println(ZonedDateTime.now());

        System.out.println(ZonedDateTime.parse("2024-04-23T19:53:51.313853100+05:30[Europe/Paris]"));

       LocalDate today =  LocalDate.now();
       System.out.println(today.plus(1, ChronoUnit.DECADES));

       LocalDate dateOfBirth = today.minus(20,ChronoUnit.YEARS);

       Period period = Period.between(today,dateOfBirth);
        System.out.println(period);

       LocalTime time1 = LocalTime.now();
       Duration twoHours = Duration.ofHours(2);

       LocalTime time2 = time1.plus(twoHours);
       Duration duration = Duration.between(time1,time2);

        System.out.println(duration);


    }
}
