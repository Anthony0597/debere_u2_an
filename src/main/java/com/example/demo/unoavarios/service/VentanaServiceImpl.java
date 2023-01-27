package com.example.demo.unoavarios.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.unoavarios.modelo.Ventana;
import com.example.demo.unoavarios.repo.IVentanaRepo;

@Service
public class VentanaServiceImpl implements IVentanaService {

	@Autowired
	private IVentanaRepo ventanaRepo;
	
	@Override
	public void guardar(Ventana ventana) {
		// TODO Auto-generated method stub
		this.ventanaRepo.insertar(ventana);
	}

	@Override
	public void modificar(Ventana ventana) {
		// TODO Auto-generated method stub
		this.ventanaRepo.actualizar(ventana);
	}

	@Override
	public Ventana buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.ventanaRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.ventanaRepo.eliminar(id);
	}

}
