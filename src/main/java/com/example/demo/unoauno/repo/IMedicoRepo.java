package com.example.demo.unoauno.repo;

import com.example.demo.unoauno.modelo.Medico;

public interface IMedicoRepo {
	public void insertar(Medico medico);
	public void actualizar(Medico medico);
	public Medico buscar(Integer id);
	public void eliminar(Integer id);
}
