package com.computacion.ejercicioclase.services.impo;

import com.computacion.ejercicioclase.dao.IMateriasDao;
import com.computacion.ejercicioclase.model.Materias;
import com.computacion.ejercicioclase.services.IMatseriaService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

public class MateriasServiceImp implements IMatseriaService {

    @Autowired
    private IMateriasDao materiasDao;


    @Transactional
    public Materias save(Materias materias) {
        return materiasDao.save(materias);
    }

    @Override
    public Iterable<Materias> findAll() {
        return materiasDao.findAll();
    }
}
