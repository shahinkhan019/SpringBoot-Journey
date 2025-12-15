package com.shahin.repository.imp1;

import com.shahin.repository.OwnerRepository;
import com.shahin.service.OwnerService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;


// This error occurs because Spring found 2 beans of type OwnerRepository (commonRepository and specialRepository),
// but your commonService class has an @Autowired field that doesn't specify which one to use. You have multiple implementations of OwnerRepository registered as beans
//Spring's autowiring can't decide which bean to inject
//The @Autowired annotation needs disambiguation
// use @Primary to stay away the confusion

@Primary
@Repository("commonRepository")
public class OwnerRepositoryImp1 implements OwnerRepository {

    public OwnerRepositoryImp1() {
        System.out.println("OwnerRepositoryImp1 common Bean Created");
    }

    @Override
    public String findOwner(int ownerId) {
        return String.format("Found owner from common repository with ownerId:"+ ownerId);
    }
}
