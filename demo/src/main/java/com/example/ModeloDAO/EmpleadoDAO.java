package com.example.ModeloDAO;

import  com.example.Interfaces.InterfaceEmpleado;
import  com.example.Modelo.Empleado;





import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;






public class EmpleadoDAO implements InterfaceEmpleado{

@Autowired
	JdbcTemplate template;

	@Override
	public List<Map<String, Object>> listar() {
		List<Map<String, Object>> list = template.queryForList("select * from empleados");
		return list;
	}

	@Override
	public List<Map<String, Object>> listarId(int id) {
		 //TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(Empleado e) {
		//String sql = "insert into empleado(id, nombre, direccion, telefono)values(?,?,?,?)";
		//return template.update(sql, e.getId,e.getNombre, e.getDireccion, e.getDireccion);
		return 1;
	}

	@Override
	public int edit(Empleado e) {
	//	String sql="update persona set nombres=?, apellidos=? where id=?";		
	//	return template.update(sql,p.getNombres(),p.getApellidos(),p.getId());
		return 1;
	}

	@Override
	public int delete(int id) {
	//	String sql="delete from persona where id=?";
	//	return template.update(sql,id);
		return 1; 
	}




}