package com.shahin;

import com.shahin.config.SpringConfig;
import com.shahin.repository.OwnerRepository;
import com.shahin.repository.imp1.OwnerRepositoryImp1;
import com.shahin.service.OwnerService;
import com.shahin.service.imp1.OwnerServiceImp1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo1 {
    public static void main(String[] args) {

        ApplicationContext context  = new AnnotationConfigApplicationContext(SpringConfig.class);

        OwnerService ownerService = context.getBean("ownerServiceImp1", OwnerService.class);
        OwnerRepository ownerRepository = context.getBean("ownerRepositoryImp1", OwnerRepository.class);
        ((OwnerServiceImp1) ownerService).setOwnerId(0); // setting ownerId using setter injection
        ((OwnerServiceImp1) ownerService).setOwnerRepository(ownerRepository);
        System.out.println(ownerService.findOwner());
        ((AnnotationConfigApplicationContext) context).close();

    }
}
