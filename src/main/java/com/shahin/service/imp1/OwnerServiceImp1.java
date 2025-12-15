package com.shahin.service.imp1;

import com.shahin.repository.OwnerRepository;
import com.shahin.service.OwnerService;

public class OwnerServiceImp1 implements OwnerService {
    private OwnerRepository ownerRepository;
    private int ownerId;

    public OwnerServiceImp1() {
        System.out.println("OwnerServiceImp1 default bean created");
    }



    public OwnerServiceImp1(OwnerRepository ownerRepository, int ownerId) {
        this.ownerRepository = ownerRepository;
        this.ownerId = ownerId;
        System.out.println("OwnerServiceImp1 object created");
    }

    @Autowired
    public void setOwnerRepository(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Value("10")
    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    @Override
    public String findOwner() {
        return ownerRepository.findOwner(ownerId);
    }
}
