package com.example.demo.unoauno.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "medico")
public class Medico {
	
	@Id
	@SequenceGenerator(name = "medi_seq",sequenceName = "medi_seq",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "medi_seq")
	@Column(name = "medi_id")
	private Integer id;
	@Column(name = "medi_cedula")
	private String cedula;
	@Column(name = "medi_nombre")
	private String nombre;
	@Column(name = "medi_apellido")
	private String apellido;
	@Column(name = "medi_fecha_registro")
	private LocalDateTime fechaRegistro;
	@Column(name = "medi_tipo_sangre")
	private String tipoSangre;
	
	
	@OneToOne(mappedBy = "medico",cascade = CascadeType.ALL)
	private Especialista especialista;
	
	//GET Y SET
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDateTime getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(LocalDateTime fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public String getTipoSangre() {
		return tipoSangre;
	}
	public void setTipoSangre(String tipoSangre) {
		this.tipoSangre = tipoSangre;
	}
	public Especialista getEspecialista() {
		return especialista;
	}
	public void setEspecialista(Especialista especialista) {
		this.especialista = especialista;
	}
	
	
	@Override
	public String toString() {
		return "Medico [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaRegistro="
				+ fechaRegistro + ", tipoSangre=" + tipoSangre + ", especialista=" + especialista + "]";
	}	
	
}
