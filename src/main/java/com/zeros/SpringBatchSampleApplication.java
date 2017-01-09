package com.zeros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(BatchConfiguration.class)
public class SpringBatchSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBatchSampleApplication.class, args);
    }
}
