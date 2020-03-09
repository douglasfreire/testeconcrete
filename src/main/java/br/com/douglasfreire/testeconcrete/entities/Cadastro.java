package br.com.douglasfreire.testeconcrete.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Cadastro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String name;
	
	@Column
	private String email;
	
	@Column
	private String password;
	
	@Column
	private String number;
	
	@Column
	private String ddd;
	
	public Cadastro() {
		// TODO Auto-generated constructor stub
	}
	
	public Cadastro(String name, String email, String password, String number, String ddd) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.number = number;
		this.ddd = ddd;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	@Override
	public String toString() {
		return "Cadastro [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", number="
				+ number + ", ddd=" + ddd + "]";
	}
	
	
}