package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyRestService {

    @GetMapping(value = "/my-resource",produces ="application/json")
    public List<String> listResources(){
        return List.of("Hello","world");
    }

}
