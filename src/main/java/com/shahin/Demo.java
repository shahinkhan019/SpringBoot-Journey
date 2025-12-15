package com.shahin;

import com.shahin.repository.OwnerRepository;
import com.shahin.repository.imp1.OwnerRepositoryImp1;
import com.shahin.service.OwnerService;
import com.shahin.service.imp1.OwnerServiceImp1;

public class Demo {
    public static void main(String[] args) {
        OwnerRepository ownerRepository = new OwnerRepositoryImp1();
        OwnerService ownerService = new OwnerServiceImp1(ownerRepository, 10);
        System.out.println(ownerService.findOwner());
    }
}
