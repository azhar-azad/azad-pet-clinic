package com.azad.dev.azadpetclinic.services;

import com.azad.dev.azadpetclinic.entities.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

    Owner findByLastName(String lastName);
}
