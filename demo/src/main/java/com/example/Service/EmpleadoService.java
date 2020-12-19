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
	public List<Map<String, Object>> listar(int id) {
		 //TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empleado add(Empleado e) {
		//String sql = "insert into empleado(id, nombre, direccion, telefono)values(?,?,?,?)";
		//return template.update(sql, e.getId,e.getNombre, e.getDireccion, e.getDireccion);
		return null;
	}

	@Override
	public Empleado edit(Empleado e) {
	//	String sql="update persona set nombres=?, apellidos=? where id=?";		
	//	return template.update(sql,p.getNombres(),p.getApellidos(),p.getId());
		return null;
	}

	@Override
	public void delete(String  id) {
	//	String sql="delete from persona where id=?";
	//	return template.update(sql,id);
		
	}


}