package com.example.springboot2026.controller.api.impl;

import com.example.springboot2026.business.dto.BlogCategoryDto;
import com.example.springboot2026.business.services.interfaces.IBlogCategoryServices;
import com.example.springboot2026.controller.api.interfaces.IBlogCategoryApi;
import com.example.springboot2026.data.entity.BlogCategoryEntity;
import com.example.springboot2026.utily.FrontEnd;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//LOMBOK
@RequiredArgsConstructor
@Log4j2

//API
@RestController
@RequestMapping("/blog/category/api/v1.0.0")
@CrossOrigin(origins = FrontEnd.REACT_URL)


public class BlogCategoryApiImpl implements IBlogCategoryApi<BlogCategoryDto> {

    //Field
    private final IBlogCategoryServices<BlogCategoryDto, BlogCategoryEntity> iBlogCaregoryServices;

    /// ///////////////////////////////////////

} // end BlofCategoryApiImpl
