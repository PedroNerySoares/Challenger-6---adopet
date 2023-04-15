package com.challenger.alura.adopet.Models;

import com.challenger.alura.adopet.enuns.EnderecoEnum;

import jakarta.annotation.Generated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Table(name = "pet")
public class PetModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // private AbrigoModel abrigo;
    @NotBlank(message = "Nome do Pet é obrigatório")
    private String nome;
    @NotBlank(message = "Descrição do Pet é obrigatório")
    private String descricao;
    private Boolean adotado;
    @NotBlank(message = "Idade do Pet é obrigatório")
    private String idade;
    @NotBlank(message = "Endereço do Pet é obrigatório")
    private EnderecoEnum endereco;
    @NotBlank(message = "Imagem do Pet é obrigatório")
    private String imagem;

    public PetModel() {
    }

    public PetModel(Long id, String nome, String descricao, String idade, EnderecoEnum endereco, String imagem) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.adotado = false;
        this.idade = idade;
        this.endereco = endereco;
        this.imagem = imagem;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getAdotado() {
        return adotado;
    }

    public void setAdotado(Boolean adotado) {
        this.adotado = adotado;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public EnderecoEnum getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoEnum endereco) {
        this.endereco = endereco;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

}
