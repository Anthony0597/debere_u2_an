package com.example.demo.manytomany.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.manytomany.modelo.Vehiculo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class VehiculoRepoImpl implements IVehiculoRepo {

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.entityManager.persist(vehiculo);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.entityManager.merge(vehiculo);
	}

	@Override
	public Vehiculo buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Vehiculo.class, id);
		
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscar(id));
	}

}
