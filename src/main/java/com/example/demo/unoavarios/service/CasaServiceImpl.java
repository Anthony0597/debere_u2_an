package com.example.demo.unoavarios.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.unoavarios.modelo.Casa;
import com.example.demo.unoavarios.repo.ICasaRepo;

@Service
public class CasaServiceImpl implements ICasaService {

	@Autowired
	private ICasaRepo casaRepo;
	
	@Override
	public void guardar(Casa casa) {
		// TODO Auto-generated method stub
		this.casaRepo.insertar(casa);
	}

	@Override
	public void modificar(Casa casa) {
		// TODO Auto-generated method stub
		this.casaRepo.actualizar(casa);
	}

	@Override
	public Casa buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.casaRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.casaRepo.eliminar(id);
	}

}
