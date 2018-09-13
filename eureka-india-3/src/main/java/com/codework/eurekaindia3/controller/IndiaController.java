package com.codework.eurekaindia3.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndiaController {

    @Value("${states}")
    private String states;

    @GetMapping("/")
    public @ResponseBody String getStates() {
        return states;
    }
}
