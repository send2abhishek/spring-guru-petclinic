package com.springframework.learn.springpetclinic.services;

import com.springframework.learn.springpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
