package com.example.ModeloDAO;

import  com.example.Interfaces.InterfaceEmpleado;
import  com.example.Modelo.Empleado;





import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;





@Repository
public class EmpleadoDAO implements InterfaceEmpleado{

	@Autowired
	JdbcTemplate template;

	@Override
	public List<Map<String, Object>> listar() {
		List<Map<String, Object>> lista = template.queryForList("select * Empleado");
		return lista;
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
	public void delete(String id) {
	//	String sql="delete from persona where id=?";
	//	return template.update(sql,id);
		
	}




}