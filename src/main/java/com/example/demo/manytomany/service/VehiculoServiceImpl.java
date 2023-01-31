package com.example.demo.manytomany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.manytomany.modelo.Vehiculo;
import com.example.demo.manytomany.repo.IVehiculoRepo;
@Service
public class VehiculoServiceImpl implements IVehiculoService {

	@Autowired
	private IVehiculoRepo vehiculoRepo;
	
	@Override
	public void guardar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.vehiculoRepo.insertar(vehiculo);
	}

	@Override
	public void modificar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.vehiculoRepo.actualizar(vehiculo);
	}

	@Override
	public Vehiculo buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.vehiculoRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.vehiculoRepo.eliminar(id);
	}

}
