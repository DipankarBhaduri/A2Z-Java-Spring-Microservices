package com.spring.multi_threading;

public class CreateThreadUsingRunnableInterface implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Runnable Value of i = "+i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }
}
