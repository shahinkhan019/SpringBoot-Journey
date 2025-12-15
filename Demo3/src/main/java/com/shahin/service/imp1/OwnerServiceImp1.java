package com.shahin.service.imp1;

import com.shahin.repository.OwnerRepository;
import com.shahin.service.OwnerService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceImp1 implements OwnerService {
    private OwnerRepository ownerRepository;
    private int ownerId;

    public OwnerServiceImp1() {  // default constructor is needed for Spring Bean creation
        System.out.println("OwnerServiceImp1 default bean created");
    }


    public OwnerServiceImp1(OwnerRepository ownerRepository, int ownerId) {
        this.ownerRepository = ownerRepository;
        this.ownerId = ownerId;
        System.out.println("OwnerServiceImp1 object created");
    }

    public void setOwnerRepository(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;   // using setter injection
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId; // using setter injection
    }

    @Override
    public String findOwner() {
        return ownerRepository.findOwner(ownerId);
    }
}
