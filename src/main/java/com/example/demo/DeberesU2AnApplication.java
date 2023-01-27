package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
	
	public static void main(String[] args) {
		SpringApplication.run(DeberesU2AnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//CRUD
		//CREATE
		Casa casa = new Casa();
		casa.setDireccion("Av. Colon y Av. 6 de diciembre");
		casa.setNumeroHabitaciones(3);
		
		Ventana vent1 = new Ventana();
		vent1.setAlto(42.3);
		vent1.setAncho(30.2);
		vent1.setCasa(casa);
		vent1.setTipoCristal("Laminado");
		
		Ventana vent2 = new Ventana();
		vent2.setAlto(42.3);
		vent2.setAncho(20.5);
		vent2.setCasa(casa);
		vent2.setTipoCristal("translucido");
		
		Ventana vent3 = new Ventana();
		vent3.setAlto(42.3);
		vent3.setAncho(20.5);
		vent3.setCasa(casa);
		vent3.setTipoCristal("Laminado");
		
		List<Ventana> ventanas = new ArrayList<>();
		ventanas.add(vent1);
		ventanas.add(vent2);
		ventanas.add(vent3);	
		
		casa.setVentana(ventanas);
		
		this.casaService.guardar(casa);
		
		//READ
		this.casaService.buscar(1);
		
		//UPDATE
		Casa casaT = this.casaService.buscar(3);
		casaT.setNumeroHabitaciones(2);
		this.casaService.modificar(casaT);
		
		//DELETE
		this.casaService.borrar(2);
	}

}
