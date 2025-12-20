package com.shahin.repository.imp1;

import com.shahin.exception.OwnerNotFoundException;
import com.shahin.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Profile("prod")
@Repository
public class OwnerRepositoryImp1 implements OwnerRepository {

    @Value("${owner.found}")
    public String ownerFound;
    @Value("${owner.not.found}")
    public String ownerNotFound;

    public OwnerRepositoryImp1() {
        System.out.println("OwnerRepositoryImp1 Bean Created");
    }

    @Override
    public String findOwner(int ownerId) throws OwnerNotFoundException{
        if (ownerId % 2 == 0) {
            return String.format(ownerFound, ownerId);
        } else {
            throw new OwnerNotFoundException(String.format(ownerNotFound, ownerId));
        }

    }
}
