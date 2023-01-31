package com.example.demo.manytomany.repo;

import com.example.demo.manytomany.modelo.Vehiculo;

public interface IVehiculoRepo {
	public void insertar(Vehiculo vehiculo);
	public void actualizar(Vehiculo vehiculo);
	public Vehiculo buscar(Integer id);
	public void eliminar(Integer id);
}
