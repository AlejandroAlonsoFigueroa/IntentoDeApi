package com.example.Interfaces;

import java.util.List;
import java.util.Map;
import com.example.Modelo.Empleado;



public interface InterfaceEmpleado{
	public List<Map<String, Object>>listar();
	public List<Map<String, Object>>listar(int id);
	public Empleado  add(Empleado e);
	public Empleado edit(Empleado e);
	public void delete(String id);






}


