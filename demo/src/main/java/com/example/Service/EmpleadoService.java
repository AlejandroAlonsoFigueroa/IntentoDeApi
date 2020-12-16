package com.example.Service;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Interfaces.InterfaceEmpleado; //importar la interfaz del empleado
import com.example.Modelo.Empleado; //IMPORTAR MDELO EMPLEADO 
import com.example.ModeloDAO.EmpleadoDAO; //impolrtar dao 

@Service
public class EmpleadoService implements InterfaceEmpleado{

	@Autowired
	EmpleadoDAO dao;
	
	@Override
	public List<Map<String, Object>> listar() {		
		return dao.listar();
	}

	@Override
	public List<Map<String, Object>> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(Empleado p) {		
	//	return dao.add(p);
		return 1; 
	}

	@Override
	public int edit(Empleado p) {
		// TODO Auto-generated method stub
		//return dao.edit(p);
		return 1;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		//return dao.delete(id);
		return 1;

	}



}