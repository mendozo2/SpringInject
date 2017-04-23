package com.oz.beans;

public class Persona {
	public int id;
	public String name;
	public String surname;
	public Pais pais;

	public Persona(int id, String name, String surname) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
	}
	
	public Persona(int id, String name, String surname,Pais pais) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.pais=pais;
	}
	
	
	public Persona() {
		super();
		
	}
	
	
	public Persona(int id) {
		super();
		this.id = id;
		
	}

	public Persona(String name) {
		super();
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	
	public String toString(){
		return id+","+name+","+surname +","+pais;
		
	}


	public Pais getPais() {
		return pais;
	}


	public void setPais(Pais pais) {
		this.pais = pais;
	}

}
