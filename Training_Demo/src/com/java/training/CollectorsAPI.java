package com.java.training;

import java.util.*;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsAPI {

    public static void main(String[] args) {
        List<String> sportsList = new ArrayList<>();

        sportsList.add("cricket");
        sportsList.add("hockey");
        sportsList.add("chess");


        sportsList.add("kabbadi");

//        System.out.println(sportsList);

       List<String> unmodifiableSportList = Collections.unmodifiableList(sportsList); //before Java 9
//        unmodifiableSportList.add("tennis");
//        System.out.println(unmodifiableSportList);


        List<Integer> numberList = Arrays.asList(1,2,3,4);


//        System.out.println(numberList.stream().filter(x -> x%2==0).collect(Collectors.toList()));


//        System.out.println(numberList.stream()
//                .flatMap(Stream::ofNullable)
//                .filter(x -> x%2==0)
//                .collect(Collectors.toList()));

//        System.out.println(numberList.stream().dropWhile(x -> x %2==0));

//        numberList.add(2);
//        System.out.println(numberList);

        List<Integer> advancedNumberList = List.of(1,2,3,4);//immutable
//        advancedNumberList.remove(2);
//        System.out.println(advancedNumberList);

        Map<Integer, String> map = Map.of(1, "john",2,"peter");

        Map<Integer, String> map1 = Map.ofEntries(Map.entry(111, "Mumbai"));

        System.out.println(map +  " " + map1);

    }
}
