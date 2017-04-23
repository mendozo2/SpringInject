package com.oz.beans;

public class Pais {
	
 public String nombre;
 Ciudad ciudad;

public Ciudad getCiudad() {
	return ciudad;
}

public void setCiudad(Ciudad ciudad) {
	this.ciudad = ciudad;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String toString(){
	return nombre+","+ciudad;
}
 

}
