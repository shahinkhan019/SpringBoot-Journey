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
//        OwnerRepository ownerRepository = new OwnerRepositoryImp1();
        ApplicationContext context  = new AnnotationConfigApplicationContext(SpringConfig.class); // i am using this context bcz it can read the config class which is annotated with @Configuration
//        OwnerService ownerService = context.getBean(OwnerService.class); it is getting confused which bean to create bcz we have two service method with same type then now just pass the method name as bean
//        OwnerService ownerService = (OwnerService) context.getBean("ownerService2"); instead of type casting i can do this like below also
        OwnerService ownerService = context.getBean("ownerServiceReal", OwnerService.class);// now it will create the bean of type OwnerServiceImp1\
        System.out.println(ownerService.findOwner());
        ((AnnotationConfigApplicationContext) context).close(); // to close the context and release the resources

    }
}
