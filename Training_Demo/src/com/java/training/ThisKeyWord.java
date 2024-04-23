package com.java.training;

public class ThisKeyWord {

    int x;
    int y;
    public ThisKeyWord(int x, int y) {
        this.x = x;
        y = y;
    }


    public static void main(String[] args)  {

        ThisKeyWord words = new ThisKeyWord(2,3);
        System.out.println(words.x + " " + words.y);

    }

}
