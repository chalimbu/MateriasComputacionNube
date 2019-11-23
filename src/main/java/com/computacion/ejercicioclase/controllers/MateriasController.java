package com.computacion.ejercicioclase.controllers;

import com.computacion.ejercicioclase.dao.IMateriasDao;
import com.computacion.ejercicioclase.model.Materias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MateriasController {

    @Autowired
    private IMateriasDao materiaService;

    @GetMapping("/materias")
    public List<Materias> findAll() {
        List<Materias> list = new ArrayList<Materias>();
        for (Materias materias : materiaService.findAll()){
            list.add(materias);
        }
        return list;
    }

    @PostMapping("/materias")
    public Materias save (@RequestBody Materias materias){
        return materiaService.save(materias);
    }
}
