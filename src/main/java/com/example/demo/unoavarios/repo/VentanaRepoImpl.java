package com.example.demo.unoavarios.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.unoavarios.modelo.Ventana;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class VentanaRepoImpl implements IVentanaRepo {

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public void insertar(Ventana ventana) {
		// TODO Auto-generated method stub
		this.entityManager.persist(ventana);
	}

	@Override
	public void actualizar(Ventana ventana) {
		// TODO Auto-generated method stub
		this.entityManager.merge(ventana);
	}

	@Override
	public Ventana buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Ventana.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscar(id));
	}

}
