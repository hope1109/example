package com.hope.thread.simpleThread;


import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * 常见的命令分析线程的信息
 * 查看线程的状态与信息，常见的3种命令，分别是jsp+jstack.exe、jmc.exe和jvisualvm.exe,他们在jdk\bin文件夹中
 */
public class Run1 {

    public static void main(String[] args) throws InterruptedException{
        for (int i = 0; i < 5; i++) {
            new Thread(){
                @Override
                public void run() {
                    try {
                        Thread.sleep(500000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        }
                }
            }.start();
        }
    }

}
