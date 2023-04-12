package com.example.viewnext.ibr.pruebasFPDual.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomErrorController implements ErrorController {
 
    private static final String PATH = "/error";
 
    @RequestMapping(value = PATH)
    public ResponseEntity<Object> error(HttpServletRequest request) {
        // manejo de excepciones
        return new ResponseEntity<>("Error occurred", HttpStatus.INTERNAL_SERVER_ERROR);
    }
 
//    @Override
//    public String getErrorPath() {
//        return PATH;
//    }
}