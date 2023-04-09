package com.challenger.alura.adopet.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenger.alura.adopet.Models.TutoresModel;
import com.challenger.alura.adopet.services.CriptografiaService;

@RestController
@RequestMapping("/tutores")
public class TutoresController {

    @Autowired
    CriptografiaService criptograficaService;

    @PostMapping 
    private void GravarTutores(){

        
    }

    
    @GetMapping
    private void RecuperaTodosTutores(@RequestBody TutoresModel tutores ){

        
        
    }
    
    @DeleteMapping 
    private void DeletarTutores(){}

    @PutMapping 
    private void AtualizarTutores(){}


    

}
