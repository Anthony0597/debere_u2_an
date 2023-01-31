package com.example.demo.manytomany.service;

import com.example.demo.manytomany.modelo.Vehiculo;

public interface IVehiculoService {
	public void guardar(Vehiculo vehiculo);
	public void modificar(Vehiculo vehiculo);
	public Vehiculo buscar(Integer id);
	public void borrar(Integer id);
}
