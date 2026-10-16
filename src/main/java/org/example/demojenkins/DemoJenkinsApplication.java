package org.example.demojenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJenkinsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoJenkinsApplication.class, args);
        System.out.println("Application is running! v2.0.0 - test");
    }

}
