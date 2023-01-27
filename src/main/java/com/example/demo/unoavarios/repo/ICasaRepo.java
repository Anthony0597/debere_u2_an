package com.example.demo.unoavarios.repo;

import com.example.demo.unoavarios.modelo.Casa;

public interface ICasaRepo {
	public void insertar(Casa casa);
	public void actualizar(Casa casa);
	public Casa buscar(Integer id);
	public void eliminar(Integer id);
}
