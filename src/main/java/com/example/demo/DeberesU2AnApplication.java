package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.unoauno.modelo.Especialista;
import com.example.demo.unoauno.modelo.Medico;
import com.example.demo.unoauno.service.IMedicoService;

@SpringBootApplication
public class DeberesU2AnApplication implements CommandLineRunner {

	@Autowired
	private IMedicoService medicoService;
	
	public static void main(String[] args) {
		SpringApplication.run(DeberesU2AnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//CRUD
		//CREATE
		Medico medi = new Medico();
		medi.setNombre("Anthony");
		medi.setApellido("Guamaninga");
		medi.setCedula("1645789623");
		medi.setTipoSangre("o+");
		medi.setFechaRegistro(LocalDateTime.of(2015, 6, 24, 16,	45));
		
		Especialista especialidad = new Especialista();
		especialidad.setLugarEspecializacion("Universidad San Francisco de Quito");
		especialidad.setRama("Neurocirugía");
		especialidad.setMedico(medi);
		
		medi.setEspecialista(especialidad);
		
		this.medicoService.guardar(medi);
		
		//READ
		this.medicoService.buscar(5);
		
		//UPDATE
		Medico medi2 = this.medicoService.buscar(8);
		medi2.setNombre("Alfredo");
		this.medicoService.modificar(medi2);
		
		//DELETE
		this.medicoService.borrar(2);
	}

}
