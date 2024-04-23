package com.java.training;

@FunctionalInterface
public interface FuncInterface {
    public abstract void add();

    private void add1() {
        System.out.println("From private method");
    }

    public static void delete() {
        System.out.println("From static method");
    }
    default void multiply() {
        add1();
        System.out.println("From Default method");
    }
}
