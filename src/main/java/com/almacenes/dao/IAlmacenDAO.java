package com.almacenes.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.almacenes.dto.Almacen;

public interface IAlmacenDAO extends JpaRepository<Almacen, Integer>{

}
