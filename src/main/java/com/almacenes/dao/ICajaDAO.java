package com.almacenes.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.almacenes.dto.Caja;

public interface ICajaDAO extends JpaRepository<Caja, String> {

}
