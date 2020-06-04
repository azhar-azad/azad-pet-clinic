package com.azad.dev.azadpetclinic.services;

import com.azad.dev.azadpetclinic.entities.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
