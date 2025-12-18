package com.shahin;

import com.shahin.service.OwnerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;



@SpringBootApplication
public class Demo implements CommandLineRunner {

    @Autowired
    private OwnerService ownerService;
    private static final Logger LOGGER = LoggerFactory.getLogger(Demo.class);
    public static void main(String[] args) {
        SpringApplication.run(Demo.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
      try(Scanner scanner = new Scanner(System.in)){
          LOGGER.info(ownerService.findOwner());
          System.out.println("Enter Id of Owner:");
          int ownerId = scanner.nextInt();
          ownerService.modifyOwner(ownerId);
          System.out.println("After modifying ownerId of OwnerService1");
          LOGGER.info( ownerService.findOwner() );
      } catch (Exception exception){
          LOGGER.error(exception.getMessage(), exception);
      }

    }
}
