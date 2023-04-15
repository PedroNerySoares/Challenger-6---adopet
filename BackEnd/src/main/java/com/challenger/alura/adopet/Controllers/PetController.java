package com.challenger.alura.adopet.Controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenger.alura.adopet.Models.PetModel;
import com.challenger.alura.adopet.repositories.PetsRepository;
import com.challenger.alura.adopet.services.CriptografiaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/pets")
public class PetController {

    @Autowired
    CriptografiaService criptograficaService;

    @Autowired
    PetsRepository petsRepository;


    @PostMapping 
    private ResponseEntity Gravarpets(@Valid @RequestBody PetModel pets){
        petsRepository.saveAndFlush(pets);
        return ResponseEntity.ok().body(pets);
    }
    @GetMapping()
    private ResponseEntity RecuperaTodospets( ){
        
        return ResponseEntity.ok().body(petsRepository.findAll());  
    
    }
    @GetMapping("/{idPet}")
    private ResponseEntity RecuperaTutor(@PathVariable  Long idPet ){
        return ResponseEntity.ok().body(petsRepository.findById(idPet));  

        
        
    }
    @DeleteMapping ("/{idPet}")
    private ResponseEntity Deletarpets(@PathVariable Long idPet){
        Optional<PetModel> tutor =  petsRepository.findById(idPet);
        if(tutor.isPresent()){
            petsRepository.deleteById(idPet);
            return   ResponseEntity.status(200).build();
        }else{
            return ResponseEntity.status(401).build();
        }
    }
  
    @PutMapping ("/{idpet}")
    private void Atualizarpets(@PathVariable Long idPet,@Valid @RequestBody PetModel tutor){

        if(petsRepository.findById(idPet).isPresent()){
            System.out.println("achei");
        }else{
            
            System.out.println("Não achei");
            
        }

        
    }


    

}
