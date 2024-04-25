package com.java.training;

public class CustomThread implements Runnable{

    public static void main(String[] args) {

        System.out.println("Hello World!");
        try {
        for (int i = 0; i < 5; i++) {
                Thread.sleep(2000);
                System.out.println("Completed!");
                Thread.interrupted();
                }
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }


        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Custom Name");
        System.out.println(Thread.currentThread().getName());

    }

    @Override
    public void run() {

    }
}
