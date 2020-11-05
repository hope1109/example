package com.hope.thread.simpleThread;

public class CreateThread {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Task());
        t1.start();
    }
}

class Task implements Runnable {
    @Override
    public void run() {
        System.out.println("this thread is running.");
    }
}
