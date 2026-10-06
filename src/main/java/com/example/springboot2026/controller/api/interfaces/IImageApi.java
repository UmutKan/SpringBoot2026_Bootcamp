package com.example.springboot2026.controller.api.interfaces;

import org.springframework.web.multipart.MultipartFile;

public interface IImageApi<D,E>{





    // IMAGE
    // IMAGE CREATE
    public D objectServiceCreateWithFile(D d, MultipartFile multipartFile);

    // IMAGE UPDATE
    public D objectServiceUpdateWithFile(Long id, D d, MultipartFile multipartFile);


}
