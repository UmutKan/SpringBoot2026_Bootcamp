package com.example.springboot2026.business.services.interfaces;

import com.example.springboot2026.business.services.ICRUDService;
import com.example.springboot2026.business.services.IModelMapperService;
import com.example.springboot2026.business.services.ISpeedAndDeleteService;
import com.example.springboot2026.business.services.*;

//D: Dto, E: entity
public interface IBlogCategoryServices<D,E> extends
        IModelMapperService<D,E>,
        ISpeedAndDeleteService<D,E>,
        ICRUDService<D,E> {








}
