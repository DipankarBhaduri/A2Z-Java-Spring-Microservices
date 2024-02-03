package com.spring.multi_threading;

public class MainThreadClass {
    public static void main(String[] args) {
        CreateThreadUsingRunnableInterface object1 = new CreateThreadUsingRunnableInterface();
        Thread thread = new Thread(object1);
        CreateThreadUsingThreadClass object2 = new CreateThreadUsingThreadClass();

        thread.start();
        object2.start();
    }
}
