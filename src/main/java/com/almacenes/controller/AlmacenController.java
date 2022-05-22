package com.almacenes.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.almacenes.dto.Almacen;
import com.almacenes.service.AlmacenServiceImpl;

@RestController
@RequestMapping("/api")
public class AlmacenController {

	@Autowired
	AlmacenServiceImpl almacenServideImpl;

	// listar todos almacenes
	@GetMapping("/almacenes")
	public List<Almacen> listarAlmacens() {
		return almacenServideImpl.listarAlmacenes();
	}

	// crear nuevo almacén
	@PostMapping("/almacenes")
	public Almacen crearAlmacen(@RequestBody Almacen almacen) {
		return almacenServideImpl.guardarAlmacen(almacen);
	}

	// listar almacén por id
	@GetMapping("/almacenes/{id}")
	public Almacen listarAlmacenXID(@PathVariable(name = "id") int id) {

		Almacen almacenPorId = new Almacen();
		almacenPorId = almacenServideImpl.listarAlmacenXID(id);
		return almacenPorId;
	}

	// actualizar almacén
	@PutMapping("/almacenes/{id}")
	public Almacen actualizarAlmacen(@PathVariable(name = "id") int id, @RequestBody Almacen almacen) {

		Almacen almacenSeleccionado = new Almacen();
		Almacen almacenActualizado = new Almacen();

		// obtenemos almacén de la DB
		almacenSeleccionado = almacenServideImpl.listarAlmacenXID(id);

		// seteamos nuevos valores
		almacenSeleccionado.setLugar(almacen.getLugar());
		almacenSeleccionado.setCapacidad(almacen.getCapacidad());

		// actualizamos almacén en la DB
		almacenActualizado = almacenServideImpl.actualizarAlmacen(almacenSeleccionado);

		return almacenActualizado;
	}

	// eliminamos almacén por id
	@DeleteMapping("/almacenes/{id}")
	public void eliminarAlmacen(@PathVariable(name = "id") int id) {
		almacenServideImpl.eliminarAlmacen(id);
	}
 
}
