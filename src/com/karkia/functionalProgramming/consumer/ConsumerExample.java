package com.karkia.functionalProgramming.consumer;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<String> consumer = (x) -> System.out.println(x.length() + ", and value is: " + x);
        consumer.accept("Hi there fella!! ");

        // Consumer built with block statement
        Consumer<Integer> consumer1 = (x) -> {
            System.out.println("x * x = "+ (x*x));
            System.out.println("x / x = " + (x/x));
        };

        consumer1.accept(10);
    }
}
