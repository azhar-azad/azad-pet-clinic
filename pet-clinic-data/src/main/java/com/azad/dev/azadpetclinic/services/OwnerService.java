package com.azad.dev.azadpetclinic.services;

import com.azad.dev.azadpetclinic.entities.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
