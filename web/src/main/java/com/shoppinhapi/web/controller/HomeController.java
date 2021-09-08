package com.shoppinhapi.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/reza")
    public ResponseEntity<AppUser> index(){
        return new ResponseEntity<>(new Account(), HttpStatus.OK);
    }

}
