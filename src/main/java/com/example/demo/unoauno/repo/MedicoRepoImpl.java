package com.example.demo.unoauno.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.unoauno.modelo.Medico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MedicoRepoImpl implements IMedicoRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Medico medico) {
		// TODO Auto-generated method stub
		this.entityManager.persist(medico);
	}

	@Override
	public void actualizar(Medico medico) {
		// TODO Auto-generated method stub
		this.entityManager.merge(medico);
	}

	@Override
	public Medico buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Medico.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscar(id));
	}

}
