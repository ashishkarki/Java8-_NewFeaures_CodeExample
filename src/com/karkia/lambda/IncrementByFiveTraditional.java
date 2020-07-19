package com.karkia.lambda;

public class IncrementByFiveTraditional implements IncrementByFiveInterface {
    @Override
    public int incrementByFive(int a) {
        return a + 5;
    }

    public static void main(String[] args) {
        var increment = new IncrementByFiveTraditional();

        System.out.println(increment.incrementByFive(10));
    }
}
