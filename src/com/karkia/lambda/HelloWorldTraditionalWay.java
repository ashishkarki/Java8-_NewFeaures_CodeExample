package com.karkia.lambda;

public class HelloWorldTraditionalWay implements IHelloWorld {
    @Override
    public String sayHello() {
        return "Hello World";
    }

    public static void main(String[] args) {
        var helloWorld = new HelloWorldTraditionalWay();
        System.out.println(helloWorld.sayHello());
    }
}
