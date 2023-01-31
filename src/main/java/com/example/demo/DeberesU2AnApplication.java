package com.example.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.manytomany.modelo.Cliente;
import com.example.demo.manytomany.modelo.Vehiculo;
import com.example.demo.manytomany.service.IVehiculoService;
import com.example.demo.unoauno.modelo.Especialista;
import com.example.demo.unoauno.modelo.Medico;
import com.example.demo.unoauno.service.IMedicoService;
import com.example.demo.unoavarios.modelo.Casa;
import com.example.demo.unoavarios.modelo.Ventana;
import com.example.demo.unoavarios.service.ICasaService;

@SpringBootApplication
public class DeberesU2AnApplication implements CommandLineRunner {

	@Autowired
	private IMedicoService medicoService;
	
	@Autowired
	private ICasaService casaService;
	
	@Autowired
	private IVehiculoService vehiculoService;
	
	public static void main(String[] args) {
		SpringApplication.run(DeberesU2AnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//CRUD
		//CREATE
		Vehiculo vehi = new Vehiculo();
		vehi.setNumeroPuertas(5);
		vehi.setPlaca("IBR-2479");
		vehi.setTipoDireccion("hidraulica");
		vehi.setTraccion("4x2");
		
		Cliente clie = new Cliente();
		clie.setCedula("1151561532");
		clie.setNombre("Mauricio");
		clie.setApellido("Torres");
		clie.setEdad(28);
		
		Cliente clie1 = new Cliente();
		clie1.setCedula("321385132");
		clie1.setNombre("Carlos");
		clie1.setApellido("Fuentes");
		clie1.setEdad(31);
		
		
		
		Set<Cliente>clientes = new HashSet<>();
		clientes.add(clie);
		clientes.add(clie1);		
		
		vehi.setClientes(clientes);
		
		this.vehiculoService.guardar(vehi);
		
		
	}

}
