package com.example.demo.unoauno.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "especialista")
public class Especialista {
	
	@Id
	@SequenceGenerator(name = "espe_seq",sequenceName = "espe_seq",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "espe_seq")
	@Column(name = "espe_id")
	private Integer id;
	@Column(name = "espe_lugar_especializacion")
	private String lugarEspecializacion;
	@Column(name = "espe_rama")
	private String rama;
	
	@OneToOne
	@JoinColumn(name = "espe_medico_cedula")
	private Medico medico;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLugarEspecializacion() {
		return lugarEspecializacion;
	}

	public void setLugarEspecializacion(String lugarEspecializacion) {
		this.lugarEspecializacion = lugarEspecializacion;
	}

	public String getRama() {
		return rama;
	}

	public void setRama(String rama) {
		this.rama = rama;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	@Override
	public String toString() {
		return "Especialista [id=" + id + ", lugarEspecializacion=" + lugarEspecializacion + ", rama=" + rama
				+ ", medico=" + medico + "]";
	}
	
	
}
