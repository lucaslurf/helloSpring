package com.lurf.springboot.helloWorldcomSpringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String mensagem(){
        return "Olá, mundo Spring!";
    }
}
