package com.hope.thread.simpleThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 通过实现callable接口，可以实现线程的返回值
 */
public class CallableThread {
    public static void main(String[] args) {

        FutureTask<String> t1 = new FutureTask<>(new Task1());
        Thread thread = new Thread(t1);
        thread.start();
        try {
            String result = t1.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}

class Task1 implements Callable<String>{

    @Override
    public String call() throws Exception {
        return "hello Callable";
    }
}
