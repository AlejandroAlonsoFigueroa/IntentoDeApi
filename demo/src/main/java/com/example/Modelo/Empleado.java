package com.example.Modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 



@Entity
public class Empleado{
	


	String id;
	String nombre;
	String telefono;
	String direccion;
	public Empleado(String id, String nombre, String direccion, String telefono){
		super();
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;


	}
	public String getId(){
		return id;
	}
	public void  setId(String id){
		this.id = id;
	}
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre= nombre;
	}
	public String getTelefono(){
		return telefono;
	}
	public void setTelefono(String telefono){
		this.telefono= telefono;
	}
	public String getDireccion(){
		return direccion;
	}
	public void setDireccion(String direccion){
		this.direccion= direccion;
	}

	

}
