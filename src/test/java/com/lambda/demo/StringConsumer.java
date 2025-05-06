package com.lambda.demo;

import java.util.function.Consumer;

public class StringConsumer{

    private String str;

    public StringConsumer(String str) {
        this.str = str;
    }

    void stringConsumer(Consumer<String> consumer) {
        consumer.accept(this.str);

    };
}
