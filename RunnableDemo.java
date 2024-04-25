package com.java.training;

public class RunnableDemo implements Runnable{

    private Thread t;
    private String threadName;

    RunnableDemo(String name){
        threadName = name;
        System.out.println("Creating : " + threadName);
    }

    public void run() {
        System.out.println("Running: " + threadName);
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Thread " + threadName + ",  " + i);
                Thread.sleep(5000);

            }
        }catch (InterruptedException e){
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting");
    }

    public void start() throws InterruptedException {
        System.out.println("Starting " + threadName);

        if(t==null){
            t =new Thread(this, threadName);
//            t.join();
//            t.setPriority(10);
            t.start();
//            t.join();
        }
    }
}
class TestThread{
    public static void main(String[] args) throws InterruptedException {
        RunnableDemo demo1 = new RunnableDemo("Thread-1");
        demo1.start();

        RunnableDemo demo2 = new RunnableDemo("Thread-2");
        demo2.start();
    }
}

