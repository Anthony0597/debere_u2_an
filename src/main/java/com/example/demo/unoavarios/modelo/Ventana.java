package com.example.demo.unoavarios.modelo;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "ventana")
public class Ventana {
	@Id
	@SequenceGenerator(name = "vent_seq", sequenceName = "vent_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vent_seq")
	@Column(name = "vent_id")
	private Integer id;
	@Column(name = "vent_alto")
	private Double alto;
	@Column(name = "vent_ancho")
	private Double ancho;
	@Column(name = "vent_tipo_cristal")
	private String tipoCristal;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "vent_id_casa")
	private Casa casa;
	
	//GET Y SET

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getAlto() {
		return alto;
	}

	public void setAlto(Double alto) {
		this.alto = alto;
	}

	public Double getAncho() {
		return ancho;
	}

	public void setAncho(Double ancho) {
		this.ancho = ancho;
	}

	public String getTipoCristal() {
		return tipoCristal;
	}

	public void setTipoCristal(String tipoCristal) {
		this.tipoCristal = tipoCristal;
	}

	public Casa getCasa() {
		return casa;
	}

	public void setCasa(Casa casa) {
		this.casa = casa;
	}

	@Override
	public String toString() {
		return "Ventana [id=" + id + ", alto=" + alto + ", ancho=" + ancho + ", tipoCristal=" + tipoCristal + ", casa="
				+ casa + "]";
	}
	
	
}
