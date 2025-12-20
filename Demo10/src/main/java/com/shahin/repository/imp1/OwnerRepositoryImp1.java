package com.shahin.repository.imp1;

import com.shahin.exception.OwnerNotFoundException;
import com.shahin.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;

@Scope("prototype")
@Repository
public class OwnerRepositoryImp1 implements OwnerRepository {

    @Value("${owner.found}")
    public String ownerFound;
    @Value("${owner.not.found}")
    public String ownerNotFound;

//    @Autowired
//    private Environment environment; // to access properties if needed, for example environment.getProperty("owner.found")

    public OwnerRepositoryImp1() {
        System.out.println("OwnerRepositoryImp1 Bean Created");
    }

    @Override
    public String findOwner(int ownerId) throws OwnerNotFoundException{
        if (ownerId % 2 == 0) {
            return String.format(ownerFound, ownerId);
        } else {
            throw new OwnerNotFoundException(String.format(ownerNotFound, ownerId)); // Using environment to get the property
        }

    }
}
