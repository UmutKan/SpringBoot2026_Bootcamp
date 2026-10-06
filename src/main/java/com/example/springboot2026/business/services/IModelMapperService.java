package com.example.springboot2026.business.services;

public interface IModelMapperService <D,E>{

    // MODELMAPPER
    public D entityToDto(E e);
    public E dtoToEntity(D e);


}
