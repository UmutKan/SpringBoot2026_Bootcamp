package com.example.springboot2026.services;

import java.util.List;

public interface ISpeedAndDeleteService <D,E>{

    // SPEED CREATE & DELETE
    // SPEED DATA
    public List<D> speedData(Integer data);

    // DELETE ALL
    public List<D> deleteData();

}
