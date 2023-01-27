package com.example.demo.unoauno.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.unoauno.modelo.Especialista;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EspecilistaRepoImpl implements IEspecialistaRepo {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insetar(Especialista especialista) {
		// TODO Auto-generated method stub
		this.entityManager.persist(especialista);
	}

	@Override
	public void actualizar(Especialista especialista) {
		// TODO Auto-generated method stub
		this.entityManager.merge(especialista);
	}

	@Override
	public Especialista buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Especialista.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscar(id));
	}

}
