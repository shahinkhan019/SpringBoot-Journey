package com.shahin.repository;

import com.shahin.exception.OwnerNotFoundException;

public interface OwnerRepository {
    String findOwner(int ownerId) throws OwnerNotFoundException;
}
