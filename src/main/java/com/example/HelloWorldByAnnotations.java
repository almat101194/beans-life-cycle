package com.example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloWorldByAnnotations {

    @PostConstruct
    public void init() throws Exception {
        System.out.println("Init method " + this.getClass().getSimpleName());
    }

    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("Destroy method " + this.getClass().getSimpleName());
    }
}
