package com.example.web.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @RequestMapping(value = "saludo")
    public String saludo(int id){

        return "Hola programadores";
    }


    @RequestMapping(value = "holamundo")
    public String HolaMundo(){
        return "Hola Mundo";
    }

}
