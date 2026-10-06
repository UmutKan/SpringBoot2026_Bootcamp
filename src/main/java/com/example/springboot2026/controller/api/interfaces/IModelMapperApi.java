package com.example.springboot2026.controller.api.interfaces;

public interface IModelMapperApi<D,E>{

    // MODELMAPPER
    public D entityToDto(E e);
    public E dtoToEntity(D e);


}
