package com.shahin.service.mock.imp1;

import com.shahin.service.OwnerService;

public class OwnerServiceImp1 implements OwnerService {

    private int ownerId;

    public OwnerServiceImp1(int ownerId) {
        this.ownerId = ownerId;
        System.out.println("OwnerServiceImp1 mock object created");
    }

    public String findOwner() {
        return String.format("Found owner from service with owner id is:" + ownerId);
    }
}
