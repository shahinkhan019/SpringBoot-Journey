package com.shahin.service.imp1;

import com.shahin.repository.OwnerRepository;
import com.shahin.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

// by default, the scope of a bean is singleton that means only one instance of the bean will be created and shared across the application
//@Scope("prototype") // it means a new bean will be created each time it is requested
@Service
public class OwnerServiceImp1 implements OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;

    @Value("10")
    private int ownerId;

    public OwnerServiceImp1() {
        System.out.println("OwnerServiceImp1 bean created");
    }


    @Override
    public String findOwner() {
        return ownerRepository.findOwner(ownerId);
    }

    @Override
    public void modifyOwner(int ownerId) {
        this.ownerId = ownerId;
    }
}
