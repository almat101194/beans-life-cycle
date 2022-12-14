package com.example;

public class HelloWorld {

    public void init() throws Exception {
        System.out.println("Init method " + this.getClass().getSimpleName());
    }

    public void destroy() throws Exception {
        System.out.println("Destroy method " + this.getClass().getSimpleName());
    }

}
