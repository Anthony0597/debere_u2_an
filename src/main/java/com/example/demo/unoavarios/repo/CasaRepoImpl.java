package com.example.demo.unoavarios.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.unoavarios.modelo.Casa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CasaRepoImpl implements ICasaRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Casa casa) {
		// TODO Auto-generated method stub
		this.entityManager.persist(casa);
	}

	@Override
	public void actualizar(Casa casa) {
		// TODO Auto-generated method stub
		this.entityManager.merge(casa);
	}

	@Override
	public Casa buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Casa.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscar(id));
	}

}
