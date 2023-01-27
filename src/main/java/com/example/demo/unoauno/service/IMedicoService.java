package com.example.demo.unoauno.service;

import com.example.demo.unoauno.modelo.Medico;

public interface IMedicoService {
	public void guardar(Medico medico);
	public void modificar(Medico medico);
	public Medico buscar(Integer id);
	public void borrar(Integer id);
}
