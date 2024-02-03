package com.spring.multi_threading;

public class CreateThreadUsingThreadClass extends Thread {
    public void run () {
        for (int i = 10; i >= 1; i--) {
            System.out.println("Thread Class Value of i = "+i);

            if (i == 6) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
