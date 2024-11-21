package com.example.tpr505;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tpr505Application {

    public static void main(String[] args) {
        SpringApplication.run(Tpr505Application.class, args);
    }

    @SpringBootApplication
    @RestController
    public class DemoApplication {

        @GetMapping("/helloworld")
        public String hello() {
            return"Hello World!";
        }
    }

}
