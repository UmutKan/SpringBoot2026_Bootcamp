package com.example.springboot2026.data.mapper;

public interface IGenericMapper <DTO, ENTITY>{
    DTO toDto(ENTITY entity);
    ENTITY toEntity(DTO dto);
}
