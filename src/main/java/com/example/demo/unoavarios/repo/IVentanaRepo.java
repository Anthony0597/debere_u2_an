package com.example.demo.unoavarios.repo;

import com.example.demo.unoavarios.modelo.Ventana;

public interface IVentanaRepo {
	public void insertar(Ventana ventana);
	public void actualizar(Ventana ventana);
	public Ventana buscar(Integer id);
	public void eliminar(Integer id);
}
