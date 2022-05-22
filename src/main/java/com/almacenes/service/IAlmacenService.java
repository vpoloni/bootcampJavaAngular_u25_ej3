package com.almacenes.service;

import java.util.List;
import com.almacenes.dto.Almacen;

public interface IAlmacenService {
	
	// READ todos almacens
	public List<Almacen> listarAlmacenes();

	// CREATE nuevao almacen
	public Almacen guardarAlmacen(Almacen almacen);

	// READ almacen por id
	public Almacen listarAlmacenXID(int id);

	// UPDATE almacen
	public Almacen actualizarAlmacen(Almacen almacen);

	// DELETE almacen
	public void eliminarAlmacen(int id);

}
