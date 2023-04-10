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

import com.challenger.alura.adopet.Models.TutoresModel;
import com.challenger.alura.adopet.repositories.TutoresRepository;
import com.challenger.alura.adopet.services.CriptografiaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/tutores")
public class TutoresController {

    @Autowired
    CriptografiaService criptograficaService;

    @Autowired
    TutoresRepository tutoresRepository;


    @PostMapping 
    private ResponseEntity GravarTutores(@Valid @RequestBody TutoresModel tutores){
        tutores.setSenha(criptograficaService.gerarHash(tutores.getSenha()));
        tutoresRepository.saveAndFlush(tutores);
        return ResponseEntity.ok().body(tutores);
    }
    @GetMapping()
    private ResponseEntity RecuperaTodosTutores( ){
        
        return ResponseEntity.ok().body(tutoresRepository.findAll());  
    
    }
    @GetMapping("/{idTutor}")
    private ResponseEntity RecuperaTutor(@PathVariable  Long idTutor ){
        return ResponseEntity.ok().body(tutoresRepository.findById(idTutor));  

        
        
    }
    @DeleteMapping ("/{idTutor}")
    private ResponseEntity DeletarTutores(@PathVariable Long idTutor){
        Optional<TutoresModel> tutor =  tutoresRepository.findById(idTutor);
        if(tutor.isPresent()){
            tutoresRepository.deleteById(idTutor);
            return   ResponseEntity.status(200).build();
        }else{
            return ResponseEntity.status(401).build();
        }
    }
  
    @PutMapping ("/{idTutor}")
    private void AtualizarTutores(@PathVariable Long idTutor,@Valid @RequestBody TutoresModel tutor){

        if(tutoresRepository.findById(idTutor).isPresent()){
            System.out.println("achei");
        }else{
            
            System.out.println("Não achei");
            
        }

        
    }


    

}
