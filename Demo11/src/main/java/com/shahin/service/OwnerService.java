package com.shahin.service;

import com.shahin.exception.OwnerNotFoundException;

public interface OwnerService {
    String findOwner() throws OwnerNotFoundException;

    void modifyOwner(int ownerId);
}
