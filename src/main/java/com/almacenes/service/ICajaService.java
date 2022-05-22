package com.almacenes.service;

import java.util.List;

import com.almacenes.dto.Caja;

public interface ICajaService {

	// READ todas cajas
	public List<Caja> listarCajas();

	// CREATE nueva caja
	public Caja guardarCaja(Caja caja);

	// READ caja por id
	public Caja listarCajaXID(String id);

	// UPDATE caja
	public Caja actualizarCaja(Caja caja);

	// DELETE caja
	public void eliminarCaja(String id);
}
