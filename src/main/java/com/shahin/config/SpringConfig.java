package com.shahin.config;
import com.shahin.repository.OwnerRepository;
import com.shahin.repository.imp1.OwnerRepositoryImp1;
import com.shahin.service.OwnerService;
import com.shahin.service.mock.imp1.OwnerServiceImp1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


// ({ "com.shahin.repository.imp1", "com.shahin.service.imp1" }) in enterprise level application there can be  a lots of
// packages so its will be difficult for me to write complete name of that particular package, now we can just write the main package name and spring will scan all the sub packages automatically
@ComponentScan({ "com.shahin" })  // what it does is it will scan the specified packages for classes annotated with @Component and register them as beans in the Spring application context.
@Configuration
public class SpringConfig { // i am using this class to configure my beans but why? bcz in real world application we may have multiple implementation
    // of same interface so to avoid confusion we can use this config class to define which implementation to use
    @Bean // it will create a bean of type OwnerService
  public OwnerService ownerService1() {
        return new com.shahin.service.mock.imp1.OwnerServiceImp1(ownerRepository(), 10);
  }

  @Bean("ownerServiceReal")
  public OwnerService ownerService() {
      OwnerServiceImp1 ownerService = new OwnerServiceImp1();
      ownerService.setOwnerRepository(ownerRepository());
      ownerService.setOwnerId(10);
        return ownerService;
  }




  @Bean
  public OwnerRepository ownerRepository() {
        return new OwnerRepositoryImp1();
  }
}
