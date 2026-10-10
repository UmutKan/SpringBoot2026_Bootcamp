package com.example.springboot2026.controller.api.interfaces;


import com.example.springboot2026.controller.api.ICRUDApi;
import com.example.springboot2026.controller.api.IImageApi;
import com.example.springboot2026.controller.api.ISortingPagingApi;
import com.example.springboot2026.controller.api.ISpeedAndDeleteApi;

public interface IBlogApi<D> extends
        ISpeedAndDeleteApi<D>,
        ICRUDApi<D>,
        IImageApi<D>,
        ISortingPagingApi<D>
{
}