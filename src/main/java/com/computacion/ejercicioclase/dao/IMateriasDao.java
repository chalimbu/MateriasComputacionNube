package com.computacion.ejercicioclase.dao;

import com.computacion.ejercicioclase.model.Materias;
import org.springframework.data.repository.CrudRepository;

public interface IMateriasDao extends CrudRepository<Materias,String> {
}
