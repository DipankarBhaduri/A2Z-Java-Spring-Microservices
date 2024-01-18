package com.spring.anonymous_class;

public class Bike {
    public static void main(String[] args) {
        Car bike = new Car(){
            public void totalWheel() {
                System.out.println("Having 2 wheels ...");
            }
        };

        bike.totalWheel();
    }
}

class Car {
    public void totalWheel() {
        System.out.println("Having 4 wheels...");
    }
}

