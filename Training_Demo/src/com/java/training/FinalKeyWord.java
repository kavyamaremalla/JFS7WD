package com.java.training;

public class FinalKeyWord {
    int x = 25;

    final double pi = 3.14;


    public static void main(String[] args) {
        FinalKeyWord word = new FinalKeyWord();
        word.x = 30;
       // word.pi = 30;
        System.out.println(word.x);
        System.out.println(word.pi);

    }
}
