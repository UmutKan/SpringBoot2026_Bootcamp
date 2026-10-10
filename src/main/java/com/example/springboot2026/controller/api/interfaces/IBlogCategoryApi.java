package com.example.springboot2026.controller.api.interfaces;

import com.example.springboot2026.controller.api.ICRUDApi;
import com.example.springboot2026.controller.api.ISpeedAndDeleteApi;

// D: dto
public interface IBlogCategoryApi <D> extends
        ISpeedAndDeleteApi<D>,
        ICRUDApi<D>
{

}
