package com.krendel.controller;

import com.krendel.dao.BaseDao;
import com.krendel.model.BaseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class GenericRestController<T extends BaseModel> {

    @Autowired
    private BaseDao<T> dao;

    @GetMapping
    public List<T> list() {
        return dao.findAll();
    }

    @PostMapping
    public T create(@RequestBody T entity) {
        return dao.save(entity);
    }

    @PutMapping(value = "{id}")
    public T update(@PathVariable(value = "id") long id, @RequestBody T entity) {
        return dao.save(entity);
    }

    @DeleteMapping(value = "{id}")
    public void delete(@PathVariable(value = "id") long id) {
        dao.delete(id);
    }

    @GetMapping(value = "{id}")
    public T get(@PathVariable(value = "id") long id) {
        return dao.findOne(id);
    }
}
