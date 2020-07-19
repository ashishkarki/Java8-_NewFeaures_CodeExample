package com.karkia.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class SumNumbersUsingCallable {
    public static int[] array = IntStream.rangeClosed(0, 5000).toArray();
    public static int expectedTotal = IntStream.rangeClosed(0, 5000).sum();

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable callable1 = () -> {
            int sum = 0;
            for (int i = 0; i < array.length/2; i++) {
                sum += array[i];
            }

            return sum;
        };

        Callable callable2 = () -> {
          int sum = 0;
            for (int i = array.length/2; i < array.length; i++) {
                sum += array[i];
            }

            return sum;
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Callable<Integer>> taskList = Arrays.asList(callable1, callable2);

        List<Future<Integer>> results = executorService.invokeAll(taskList);

        int sum = 0;
        for (Future<Integer> result:
             results) {
            sum += result.get();

            System.out.println("Partial sum is " + result.get());
        }

        System.out.println("Total sum from callables is " + sum);
        System.out.println("Expected sum from IntStream is " + expectedTotal);

        executorService.shutdown();
    }

}
