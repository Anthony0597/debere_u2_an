package com.example.demo.unoauno.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.unoauno.modelo.Especialista;
import com.example.demo.unoauno.repo.IEspecialistaRepo;

@Service
public class EspecialistaServiceImpl implements IEspecialistaService {

	@Autowired
	private IEspecialistaRepo especialistaRepo;
	
	@Override
	public void guardar(Especialista especialista) {
		// TODO Auto-generated method stub
		this.especialistaRepo.insetar(especialista);
	}

	@Override
	public void modificar(Especialista especialista) {
		// TODO Auto-generated method stub
		this.especialistaRepo.actualizar(especialista);
	}

	@Override
	public Especialista buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.especialistaRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.especialistaRepo.eliminar(id);
	}

}
