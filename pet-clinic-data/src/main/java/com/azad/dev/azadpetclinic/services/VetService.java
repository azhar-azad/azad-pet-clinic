package com.azad.dev.azadpetclinic.services;

import com.azad.dev.azadpetclinic.entities.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
