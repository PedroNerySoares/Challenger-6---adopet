package com.challenger.alura.adopet.Models;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "tutores")
public class TutoresModel {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long    id;
    @NotBlank(message = "Nome do Tutor é obrigatório!")
    private String  nome;
    @NotBlank(message = "Email do Tutor é obrigatório!")
    private String  email;
    @NotBlank(message = "Senha do Tutor é obrigatório!")
    private String  senha;

    private String    biografia;
    private String    cidade;
    private String    foto;

    public TutoresModel(){}
    

    public TutoresModel(Long id, String nome, String email, String senha, String biografia, String cidade,
            String foto) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.biografia = biografia;
        this.cidade = cidade;
        this.foto = foto;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    } 
    

}
