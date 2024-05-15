package com.java.training;

import java.util.stream.Collectors;

public class TextBlocks {

    public static void main(String[] args) {
        String s = "Hello \n " +
                    "world! \n ";

//        System.out.println(s.repeat(4));
//        System.out.println(s.lines().collect(Collectors.toList()));

        String welcomeNote = """ 
                Hello,
                          Welcome!
                               To the   Course.                          
                """;

        System.out.println(welcomeNote.repeat(4));
    }
}
