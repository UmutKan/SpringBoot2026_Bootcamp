package com.example.springboot2026.business.services.interfaces;

import com.example.springboot2026.business.services.*;
import com.example.springboot2026.business.services.*;

//D: Dto, E: entity
public interface IBlogServices<D,E> extends
        IModelMapperService<D,E>,
        ISpeedAndDeleteService<D,E>,
        ICRUDService<D,E>,
        IImageService<D,E>,
        ISortingPagingService<D,E> {








}
