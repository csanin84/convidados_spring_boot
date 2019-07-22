package com.algaworks.festa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Convidado implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    //@GeneratedValue(generator = "increment")
    //@GenericGenerator( name = "increment", strategy = "increment")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer quantidadeAcompanhantes;

    public Convidado() {
        super();
    }

    public Convidado(Long id, String nome, Integer quantidadeAcompanhantes) {
        this.id = id;
        this.nome = nome;
        this.quantidadeAcompanhantes = quantidadeAcompanhantes;
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

    public Integer getQuantidadeAcompanhantes() {
        return quantidadeAcompanhantes;
    }

    public void setQuantidadeAcompanhantes(Integer quantidadeAcompanhantes) {
        this.quantidadeAcompanhantes = quantidadeAcompanhantes;
    }

}//fim da clase Convidado
