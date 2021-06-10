package com.example.kafkaconsumerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;

@SpringBootApplication
public class KafkaConsumerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaConsumerDemoApplication.class, args);
    }

    @Bean
    public Consumer<String> process() {
        return System.out::println;
    }

}
