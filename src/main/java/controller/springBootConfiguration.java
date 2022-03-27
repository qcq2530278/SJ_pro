package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
@springBootApplication
public class springBootConfiguration {
    public static void main(String[] args){
        SpringApplication.run(springBootConfiguration.class,args);
    }
}
