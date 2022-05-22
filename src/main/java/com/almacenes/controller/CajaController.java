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
import com.almacenes.dto.Caja;
import com.almacenes.service.CajaServiceImpl;

@RestController
@RequestMapping("/api")
public class CajaController {

	@Autowired
	CajaServiceImpl cajaServideImpl;

	// listar todas cajas
	@GetMapping("/cajas")
	public List<Caja> listarCajas() {
		return cajaServideImpl.listarCajas();
	}

	// crear nueva caja
	@PostMapping("/cajas")
	public Caja crearCaja(@RequestBody Caja caja) {
		return cajaServideImpl.guardarCaja(caja);
	}

	// listar caja por id
	@GetMapping("/cajas/{id}")
	public Caja listarCajaXID(@PathVariable(name = "id") String id) {

		Caja cajaPorId = new Caja();
		cajaPorId = cajaServideImpl.listarCajaXID(id);
		return cajaPorId;

	}

	// actualizar caja
	@PutMapping("/cajas/{id}")
	public Caja actualizarCaja(@PathVariable(name = "id") String id, @RequestBody Caja caja) {

		Caja cajaSeleccionada = new Caja();
		Caja cajaActualizada = new Caja();

		// obtenemos caja de la DB
		cajaSeleccionada = cajaServideImpl.listarCajaXID(id);

		// seteamos nuevos valores
		cajaSeleccionada.setContenido(caja.getContenido());
		cajaSeleccionada.setValor(caja.getValor());
		cajaSeleccionada.setAlmacen(caja.getAlmacen());

		// actualizamos caja en la DB
		cajaActualizada = cajaServideImpl.actualizarCaja(cajaSeleccionada);

		return cajaActualizada;
	}

	// eliminamos caja por id
	@DeleteMapping("/cajas/{id}")
	public void eliminarCaja(@PathVariable(name = "id") String id) {
		cajaServideImpl.eliminarCaja(id);
	}

}
