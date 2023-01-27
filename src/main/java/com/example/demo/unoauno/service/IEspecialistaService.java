package com.example.demo.unoauno.service;

import com.example.demo.unoauno.modelo.Especialista;

public interface IEspecialistaService {
	public void guardar(Especialista especialista);
	public void modificar(Especialista especialista);
	public Especialista buscar(Integer id);
	public void borrar(Integer id);
}
