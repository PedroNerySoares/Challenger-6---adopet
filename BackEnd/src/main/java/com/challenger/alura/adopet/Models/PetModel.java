package com.challenger.alura.adopet.Models;

import com.challenger.alura.adopet.enuns.EnderecoEnum;

import jakarta.persistence.Table;

@Table(name = "pet")
public class PetModel {
    private Long            id;
    // private AbrigoModel  abrigo;
    private String          nome;
    private String          descricao;
    private Boolean         adotado;
    private String          idade;
    private EnderecoEnum    endereco;
    private String          imagem;


    
}
