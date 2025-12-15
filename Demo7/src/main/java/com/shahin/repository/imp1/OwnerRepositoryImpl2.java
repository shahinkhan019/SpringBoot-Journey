package com.shahin.repository.imp1;

import com.shahin.repository.OwnerRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;


@Repository("specialRepository")
public class OwnerRepositoryImpl2 implements OwnerRepository {

    public OwnerRepositoryImpl2() {
        System.out.println("OwnerRepositoryImp1 special Bean Created");
    }

    @Override
    public String findOwner(int ownerId) {
        return String.format("Found owner from special repository with ownerId:"+ ownerId);
    }
}
