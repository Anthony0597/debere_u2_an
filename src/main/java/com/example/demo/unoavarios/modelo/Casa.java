package com.example.demo.unoavarios.modelo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "casa")
public class Casa {
	
	@Id
	@SequenceGenerator(name = "casa_seq", sequenceName = "casa_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "casa_seq")
	@Column(name = "casa_id")
	private Integer id;
	@Column(name = "casa_direccion")
	private String direccion;
	@Column(name = "casa_nuemro_habitaciones")
	private Integer numeroHabitaciones;
	
	@OneToMany(mappedBy = "casa",cascade = CascadeType.ALL)
	private List<Ventana> ventana;

	//GET Y SET
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getNumeroHabitaciones() {
		return numeroHabitaciones;
	}

	public void setNumeroHabitaciones(Integer numeroHabitaciones) {
		this.numeroHabitaciones = numeroHabitaciones;
	}

	public List<Ventana> getVentana() {
		return ventana;
	}

	public void setVentana(List<Ventana> ventana) {
		this.ventana = ventana;
	}

	@Override
	public String toString() {
		return "Casa [id=" + id + ", direccion=" + direccion + ", numeroHabitaciones=" + numeroHabitaciones
				+ ", ventana=" + ventana + "]";
	}
	
		
}
