package com.example.springboot2026.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

abstract public class AllBeanMethod {

    abstract public void onInit(); //Bean oluşturulduğunda çalışacak method
    abstract public void onDestory(); //Bean yok edilmeden hemen önce çalışcak method
}
