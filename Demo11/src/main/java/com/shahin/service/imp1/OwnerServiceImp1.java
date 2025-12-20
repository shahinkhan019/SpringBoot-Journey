package com.shahin.service.imp1;

import com.shahin.exception.OwnerNotFoundException;
import com.shahin.repository.OwnerRepository;
import com.shahin.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceImp1 implements OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;

    @Value("${owner.id}")
    private int ownerId;

    public OwnerServiceImp1() {
        System.out.println("OwnerServiceImp1 bean created");
    }


    @Override
    public String findOwner() throws OwnerNotFoundException {
        return ownerRepository.findOwner(ownerId);
    }

    @Override
    public void modifyOwner(int ownerId) {
        this.ownerId = ownerId;
    }
}
