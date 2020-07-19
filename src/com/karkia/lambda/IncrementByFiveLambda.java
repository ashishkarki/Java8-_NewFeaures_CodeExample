package com.karkia.lambda;

public class IncrementByFiveLambda {

    public static void main(String[] args) {
        IncrementByFiveInterface increment = (a) -> a + 10;

        System.out.println(increment.incrementByFive(5));
    }
}
