package com.mycompany.controller;

import com.mycompany.domain.Persona;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by joliveros on 21/03/2017.
 */
@Controller
public class PersonaController {
    @RequestMapping(value = "/verPersona")
    public String enviar(Persona persona) {
        persona = new Persona();
        persona.setNombre("carlos");
        persona.setEdad(7);
        return "verPersona";
    }

    @RequestMapping(value = "/formularioPersona")
    public String formularioPersona(@ModelAttribute Persona persona) {
        return "formularioPersona";
    }
//
//    @ModelAttribute("direccion")
//    public Direccion direccion() {
//        return new Direccion();
//    }
}
