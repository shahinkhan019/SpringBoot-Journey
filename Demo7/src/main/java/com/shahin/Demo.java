package com.shahin;

import com.shahin.repository.OwnerRepository;
import com.shahin.service.OwnerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@ComponentScan
@Configuration
public class Demo {
    public static void main(String[] args) {

        ApplicationContext context  = new AnnotationConfigApplicationContext(Demo.class);

        OwnerService ownerService = context.getBean("specialService", OwnerService.class);
        OwnerRepository ownerRepository = context.getBean("commonRepository", OwnerRepository.class);
        System.out.println(ownerService.findOwner());
        ((AnnotationConfigApplicationContext) context).close();

    }
}
