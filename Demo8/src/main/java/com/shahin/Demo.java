package com.shahin;

import com.shahin.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

// @Configuration + @ComponentScan + @EnableAutoConfiguration
@SpringBootApplication
public class Demo implements CommandLineRunner {

    @Autowired
    private OwnerService ownerService1;
    @Autowired
    private OwnerService ownerService2;

    public static void main(String[] args) {
        SpringApplication.run(Demo.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
      try(Scanner scanner = new Scanner(System.in)){
          System.out.println("Before modifying owner Id of OwnerService1");
          System.out.println("ownerService1 : " + ownerService1.findOwner());
          System.out.println("ownerService2 : " + ownerService2.findOwner());
          System.out.println("Enter Id of Owner:");
          int ownerId = scanner.nextInt();
          ownerService1.modifyOwner(ownerId);
          System.out.println("After modifying ownerId of OwnerService1");
          System.out.println("ownerService1 : " + ownerService1.findOwner() );
          System.out.println("ownerService2 : " + ownerService2.findOwner() );
      } catch (Exception e){
          System.out.println(e.getMessage());
      }

    }
}
