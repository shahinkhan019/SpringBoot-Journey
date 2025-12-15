package com.shahin;

import com.shahin.Demo6.Demo6Application;
import com.shahin.repository.OwnerRepository;
import com.shahin.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @Configuration + @ComponentScan + @EnableAutoConfiguration
@SpringBootApplication
public class Demo implements CommandLineRunner {

    @Autowired
    private OwnerService ownerService;

    public static void main(String[] args) {
        System.out.println(1);
        SpringApplication.run(Demo6Application.class, args);
        System.out.println(2);

    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(3);
        System.out.println(ownerService.findOwner());
        System.out.println(4);
    }
}
