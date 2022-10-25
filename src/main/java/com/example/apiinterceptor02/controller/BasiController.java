package com.example.apiinterceptor02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.html.HTMLTableCaptionElement;

import java.util.logging.Handler;

@RestController
public class BasiController {

    @GetMapping
    public String get(){
        return "Welcomes";
    }
}
