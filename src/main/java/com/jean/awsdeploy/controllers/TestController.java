package com.jean.awsdeploy.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public ResponseEntity<Object> ok() {
        return ResponseEntity.ok().build();
    }
}
