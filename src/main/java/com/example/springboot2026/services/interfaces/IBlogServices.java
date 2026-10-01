package com.example.springboot2026.services.interfaces;

import com.example.springboot2026.services.*;
import org.springframework.data.domain.Page;
import org.springframework.web.multipart.MultipartFile;
import org.thymeleaf.model.IModel;

import java.util.List;
//D: Dto, E: entity
public interface IBlogServices<D,E> extends
        IModelMapperService<D,E>,
        ISpeedAndDeleteService<D,E>,
        ICRUDService<D,E>,
        IImageService<D,E>,
        ISortingPagingService<D,E> {








}
