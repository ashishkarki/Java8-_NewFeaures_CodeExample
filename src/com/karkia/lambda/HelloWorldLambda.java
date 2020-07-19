package com.karkia.lambda;

public class HelloWorldLambda {

    public static void main(String[] args) {
        // implementing sayHelloWorld Using Lambda
        IHelloWorld iHelloWorld = () -> "hello world from lambda";

        System.out.println(iHelloWorld.sayHello());
    }
}
