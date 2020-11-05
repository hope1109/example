package com.hope.thread.simpleThread;

public class CreateThread1 extends Thread{
    @Override
    public void run() {
        System.out.println("The thread is by extends is running");
    }

    public static void main(String[] args) {
        CreateThread1 t1 = new CreateThread1();
        t1.start();
    }
}
