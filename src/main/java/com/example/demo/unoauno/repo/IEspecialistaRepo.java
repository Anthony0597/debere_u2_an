package com.example.demo.unoauno.repo;

import com.example.demo.unoauno.modelo.Especialista;

public interface IEspecialistaRepo {
	public void insetar(Especialista especialista);
	public void actualizar(Especialista especialista);
	public Especialista buscar(Integer id);
	public void eliminar(Integer id);
}
