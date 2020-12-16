package com.example.Interfaces;

import java.util.List;
import java.util.Map;
import com.example.Modelo.Empleado;



public interface InterfaceEmpleado{
	public List<Map<String, Object>>listar();
	public List<Map<String, Object>>listarId(int id);
	public int  add(Empleado p);
	public int edit(Empleado p);
	public int delete(int id);





}


