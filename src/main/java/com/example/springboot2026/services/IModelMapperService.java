package com.example.springboot2026.services;

public interface IModelMapperService <D,E>{

    // MODELMAPPER
    public D entityToDto(E e);
    public E dtoToEntity(D e);


}
