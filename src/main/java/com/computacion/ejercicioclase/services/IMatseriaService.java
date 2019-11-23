package com.computacion.ejercicioclase.services;

import com.computacion.ejercicioclase.model.Materias;

import java.util.List;

public interface IMatseriaService {
    Materias save(Materias materias);
    Iterable<Materias> findAll();
}
