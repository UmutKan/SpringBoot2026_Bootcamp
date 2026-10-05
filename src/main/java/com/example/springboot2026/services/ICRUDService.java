package com.example.springboot2026.services;

import java.util.List;

public interface ICRUDService <D,E>{
    // CRUD
    // CREATE
    public D objectServiceCreate(D d);

    // LIST
    public List<D> objectServiceList();

    // FIND BY ID
    public D  objectServiceFindById(Long id);

    // UPDATE
    public D objectServiceUpdate(Long id, D d);

    // DELETE
    public D objectServiceDelete(Long id);


}
