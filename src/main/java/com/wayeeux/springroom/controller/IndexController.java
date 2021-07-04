package com.wayeeux.springroom.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/demo")
public class IndexController {

    @GetMapping(path = "index")
    public String index() {
        return "Yes it works";
    }
}
