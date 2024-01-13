package com.spring.generics_in_java;

import java.util.Stack;

public class ImplimentGenericsStackToPushPop {
    public static void main(String[] args) {
        StackClass<Integer> integerStackClass = new StackClass<>();
        integerStackClass.pushData(3);
        integerStackClass.pushData(5);
        integerStackClass.pushData(7);

        StackClass<String> stringStackClass = new StackClass<>();
        stringStackClass.pushData("Aniruddha");
        stringStackClass.pushData("Nahida");
        stringStackClass.pushData("Sonia");

        integerStackClass.print();
        stringStackClass.print();
    }
}

class StackClass <T> {
    Stack<T> stack = new Stack<>();

    public void pushData (T thingToPush) {
        stack.push(thingToPush);
    }

    public void print() {
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}