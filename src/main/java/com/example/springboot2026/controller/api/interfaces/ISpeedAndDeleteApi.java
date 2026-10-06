package com.example.springboot2026.controller.api.interfaces;

import java.util.List;

public interface ISpeedAndDeleteApi<D,E>{

    // SPEED CREATE & DELETE
    // SPEED DATA
    public List<D> speedData(Integer data);

    // DELETE ALL
    public List<D> deleteData();

}
