package com.challenger.alura.adopet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.challenger.alura.adopet.Models.PetModel;

@Repository
public interface PetsRepository extends JpaRepository<PetModel,Long>{
    
}
