package com.idat.EFLeonardoHuamaniPerezPIZZERIA.Service;

import java.util.List;

import com.idat.EFLeonardoHuamaniPerezPIZZERIA.Model.Pizzeria;

public interface PizzeriaService {
	List<Pizzeria> listar();
	Pizzeria obtenerId(Integer id);
	void guardar(Pizzeria pizzeria);
	void eliminar(Integer id);
	void actualizar(Pizzeria pizzeria);
}
