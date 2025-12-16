package com.shahin.service.imp1;

import com.shahin.repository.OwnerRepository;
import com.shahin.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("specialOwnerService")
public class OwnerServiceImp2 implements OwnerService {

    @Qualifier("specialRepository")
    @Autowired
    private OwnerRepository ownerRepository;

    @Value("20")
    private int ownerId;

    public OwnerServiceImp2() {
        System.out.println("OwnerServiceImp1 special bean created");
    }

    @Override
    public String findOwner() {
        return ownerRepository.findOwner(ownerId);
    }
}
