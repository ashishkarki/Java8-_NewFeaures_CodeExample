package com.karkia.lambda;

public class RunnableExample {

    public static void main(String[] args) {
        // traditional way
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 0; i < 10; i++) {
                   sum += i;
                }

                System.out.println("Traditional way sum: " + sum);
            }
        };
        new Thread(runnable).start();

        // lambda way
        Runnable runnableLambda = () -> {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }

            System.out.println("Lambda way sum: " + sum);
        };
        new Thread(runnableLambda).start();

        // implement using Thread in Lambda way
        new Thread(() -> {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }

            System.out.println("Direct Thread Lambda way sum: " + sum);
        }).start();
    }
}
