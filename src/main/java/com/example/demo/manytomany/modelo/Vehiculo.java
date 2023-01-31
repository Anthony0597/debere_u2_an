package com.example.demo.manytomany.modelo;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehiculo")
public class Vehiculo {
	
	@Id
	@SequenceGenerator(name = "vehi_seq", sequenceName = "vehi_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vehi_seq")
	@Column(name = "vehi_id")
	private Integer id;
	@Column(name = "vehi_placa")
	private String placa;
	@Column(name = "vehi_traccion")
	private String traccion;
	@Column(name = "vehi_numero_puertas")
	private Integer numeroPuertas;
	@Column(name = "vehi_tipo_direccion")
	private String tipoDireccion;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "vehiculo_cliente",
	joinColumns = @JoinColumn(name = "vecl_id_vehiculo"), 
	inverseJoinColumns = @JoinColumn(name = "vecl_id_cliente"))
	private Set<Cliente> clientes;

	//GET Y SET 
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getTraccion() {
		return traccion;
	}

	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}

	public Integer getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(Integer numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public String getTipoDireccion() {
		return tipoDireccion;
	}

	public void setTipoDireccion(String tipoDireccion) {
		this.tipoDireccion = tipoDireccion;
	}

	public Set<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	
}
