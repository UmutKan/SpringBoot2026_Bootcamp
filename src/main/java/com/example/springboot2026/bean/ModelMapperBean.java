package com.example.springboot2026.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperBean extends AllBeanMethod{

    //Instance
    private final ModelMapper modelMapper = new ModelMapper();

    @Bean(name="modelMapper")
    public ModelMapper modelMapperMethod(){
        //1. yol
        //ModelMapper data = new ModelMapper();

        //2.yol
        //return new ModelMapper();

        //3.yol
        return modelMapper;
    }


    @PostConstruct //Bean oluşturulduğunda çalışacak method
    @Override
    public void onInit(){
        System.out.println("ModelMapper başladı...");
    }

    @PreDestroy //Bean yok edilmeden hemen önce çalışcak method
    @Override
    public void onDestory(){
        System.out.println("ModelMapper bean öldü...");
    }
}
