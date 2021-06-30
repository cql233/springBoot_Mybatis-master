package com.example;

import lombok.SneakyThrows;

import java.util.concurrent.locks.ReentrantLock;

public class UnsafeTest {
    private  volatile int i=0;

    public static void main(String[] args) {
        ReentrantLock lock=new ReentrantLock();
        UnsafeTest unsafeTest=new UnsafeTest();
        new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
//                synchronized (this){
                while(unsafeTest.i<200){
//                Thread.sleep(500);
                unsafeTest.i++;
                System.out.println(unsafeTest.i);
                    Thread.sleep(500);
                }
//            }
            }
        }).start();
        new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
//                synchronized (this){
                while(unsafeTest.i<200){

                unsafeTest.i++;
                System.out.println(unsafeTest.i);
                    Thread.sleep(500);
                }
//                }
            }
        }).start();
    }
}
