package com.example.springboot2026.controller.api.interfaces;

import com.example.springboot2026.error.ApiResult;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ICRUDApi<D,E>{
    // CRUD
    // CREATE
    public ResponseEntity<ApiResult<?>> objectApiCreate(D d);

    // LIST
    public ResponseEntity<ApiResult<List<D>>> objectApiList();

    // FIND BY ID
    public ResponseEntity<ApiResult<?>>  objectApiFindById(Long id);

    // UPDATE
    public ResponseEntity<ApiResult<?>> objectApiUpdate(Long id, D d);

    // DELETE
    public ResponseEntity<ApiResult<?>> objectApiDelete(Long id);


}
