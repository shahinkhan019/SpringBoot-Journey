package com.shahin.repository.mock.impl;

import com.shahin.exception.OwnerNotFoundException;
import com.shahin.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Profile("local")
@Repository
public class OwnerRepositoryImp2 implements OwnerRepository {

    @Value("${owner.found}")
    public String ownerFound;
    @Value("${owner.not.found}")
    public String ownerNotFound;

    public OwnerRepositoryImp2() {
        System.out.println("OwnerRepositoryImp1 mock Bean Created");
    }

    @Override
    public String findOwner(int ownerId) throws OwnerNotFoundException{
        return String.format(ownerFound, ownerId);
    }
}
