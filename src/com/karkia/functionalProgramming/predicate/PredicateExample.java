package com.karkia.functionalProgramming.predicate;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        // if number is > 10 true
        Predicate<Integer> predicate1 = (i) -> i > 10;
        System.out.println(predicate1.test(100));

        // i > 10 && number is even
        Predicate<Integer> predicate2 = (i) -> i % 2 == 0;
        System.out.println(predicate1.and(predicate2).test(20));

        // i > 10 || i is even
        System.out.println(predicate1.or(predicate2).test(21));
    }
}
