package com.almacenes.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cajas")
public class Caja {

	// atributos
	@Id
	@Column(name = "id")
	private String id;
	private String contenido;
	private int valor;
	@ManyToOne
	@JoinColumn(name = "almacen")
	private Almacen almacen;

	// constructores
	public Caja() {
	}

	public Caja(String id, String contenido, int valor, Almacen almacen) {

		this.id = id;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
	}

	// getters y setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Almacen getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	// método toString
	@Override
	public String toString() {
		return "Caja [id=" + id + ", contenido=" + contenido + ", valor=" + valor + "]";
	}

}
