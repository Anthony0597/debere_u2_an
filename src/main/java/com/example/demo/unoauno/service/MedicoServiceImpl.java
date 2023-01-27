package com.example.demo.unoauno.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.unoauno.modelo.Medico;
import com.example.demo.unoauno.repo.IMedicoRepo;

@Service
public class MedicoServiceImpl implements IMedicoService {
	
	@Autowired
	private IMedicoRepo medicoRepo;
	
	@Override
	public void guardar(Medico medico) {
		// TODO Auto-generated method stub
		this.medicoRepo.insertar(medico);
	}

	@Override
	public void modificar(Medico medico) {
		// TODO Auto-generated method stub
		this.medicoRepo.actualizar(medico);
	}

	@Override
	public Medico buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.medicoRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.medicoRepo.eliminar(id);
	}

}
