package com.shahin.service.imp1;

import com.shahin.repository.OwnerRepository;
import com.shahin.service.OwnerService;

public class OwnerServiceImp1 implements OwnerService {
    private OwnerRepository ownerRepository;
    private int ownerId;

    public OwnerServiceImp1(OwnerRepository ownerRepository, int ownerId) {
        this.ownerRepository = ownerRepository;
        this.ownerId = ownerId;
        System.out.println("OwnerServiceImp1 object created");
    }

    @Override
    public String findOwner() {
        return ownerRepository.findOwner(ownerId);
    }
}
