package com.java.training;

public class FuncClass implements FuncInterface{

    @Override
    public void add() {
        System.out.println("From class");
    }

     void myClassLevelMethod(){

    }

    public static void main(String[] args) {
        FuncInterface.delete();

        FuncInterface funcInterface = new FuncClass();
        funcInterface.multiply();
        funcInterface.add();
    }
}


