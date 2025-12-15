package com.shahin.config;
import com.shahin.repository.OwnerRepository;
import com.shahin.repository.imp1.OwnerRepositoryImp1;
import com.shahin.service.OwnerService;
import com.shahin.service.imp1.OwnerServiceImp1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig { // i am using this class to configure my beans but why? bcz in real world application we may have multiple implementation
    // of same interface so to avoid confusion we can use this config class to define which implementation to use
    @Bean // it will create a bean of type OwnerService
  public OwnerService ownerService1() {
        return new com.shahin.service.mock.imp1.OwnerServiceImp1(ownerRepository(), 10);
  }

  @Bean("ownerServiceReal")
  public OwnerService ownerService2() {
        return new OwnerServiceImp1(ownerRepository(), 20);
  }

  @Bean
  public OwnerRepository ownerRepository() {
        return new OwnerRepositoryImp1();
  }
}
