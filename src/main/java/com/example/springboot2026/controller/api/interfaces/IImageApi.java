package com.example.springboot2026.controller.api.interfaces;

import com.example.springboot2026.error.ApiResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

public interface IImageApi<D>{





    // IMAGE
    // IMAGE CREATE
    public ResponseEntity<ApiResult<?>> objectServiceCreateWithFile(String json, MultipartFile multipartFile);

    // IMAGE UPDATE
    public ResponseEntity<ApiResult<?>> objectServiceUpdateWithFile(Long id, String json, MultipartFile multipartFile);


}
