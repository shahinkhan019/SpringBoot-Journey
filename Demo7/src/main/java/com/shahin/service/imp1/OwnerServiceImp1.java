package com.shahin.service.imp1;

import com.shahin.repository.OwnerRepository;
import com.shahin.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service("ownerServiceImp1")
public class OwnerServiceImp1 implements OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;

    @Value("20")
    private int ownerId;

    public OwnerServiceImp1() {
        System.out.println("OwnerServiceImp1 common bean created");
    }


    @Override
    public String findOwner() {
        return ownerRepository.findOwner(ownerId);
    }
}
