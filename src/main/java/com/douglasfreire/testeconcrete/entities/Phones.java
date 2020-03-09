package com.douglasfreire.testeconcrete.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Phones implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;
    private String ddd;
    private String number;

    @JsonIgnore
    @ManyToOne
    private Cadastro cadastro;

    public Phones() {

    }

	public Phones(Long id, String ddd, String number, Cadastro cadastro) {
		super();
		this.id = id;
		this.ddd = ddd;
		this.number = number;
		this.cadastro = cadastro;
	}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Cadastro getCadastro() {
        return cadastro;
    }

    public void setCadastro(Cadastro cadastro) {
        this.cadastro = cadastro;
    }

	@Override
	public String toString() {
		return "Phones [ddd=" + ddd + ", number=" + number + ", cadastro=" + cadastro + "]";
	}

}
