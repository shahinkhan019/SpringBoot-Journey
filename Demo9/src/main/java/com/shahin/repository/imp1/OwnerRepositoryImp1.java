package com.shahin.repository.imp1;

import com.shahin.exception.OwnerNotFoundException;
import com.shahin.repository.OwnerRepository;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Scope("prototype")
@Repository
public class OwnerRepositoryImp1 implements OwnerRepository {

    public OwnerRepositoryImp1() {
        System.out.println("OwnerRepositoryImp1 Bean Created");
    }

    @Override
    public String findOwner(int ownerId) throws OwnerNotFoundException{
        if (ownerId % 2 == 0) {
            return String.format("Found owner with ownerId: %s ", ownerId);
        } else {
            throw new OwnerNotFoundException(String.format("Can't find owner with ownerId: %s", ownerId));
        }

    }
}
