package com.example.demo.unoavarios.service;

import com.example.demo.unoavarios.modelo.Casa;

public interface ICasaService {
	public void guardar(Casa casa);
	public void modificar(Casa casa);
	public Casa buscar(Integer id);
	public void borrar(Integer id);
}
