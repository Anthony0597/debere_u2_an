package com.example.demo.unoavarios.service;

import com.example.demo.unoavarios.modelo.Ventana;

public interface IVentanaService {
	public void guardar(Ventana ventana);
	public void modificar(Ventana ventana);
	public Ventana buscar(Integer id);
	public void borrar(Integer id);
}
