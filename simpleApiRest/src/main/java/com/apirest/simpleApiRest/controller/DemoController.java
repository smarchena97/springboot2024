package com.apirest.simpleApiRest.controller;

import com.apirest.simpleApiRest.entity.Persona;
import com.apirest.simpleApiRest.service.IPersonaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class DemoController {

    private final IPersonaService service;

    public DemoController(IPersonaService service) {
        this.service = service;
    }

    @PostMapping
    public void savePersona(@RequestBody Persona persona){
        service.save(persona);
    }

    @GetMapping
    public List<Persona> listarPersonas(){
        return service.listPersonas();
    }

    @GetMapping("{id}")
    public Persona findPersona(@PathVariable int id){
        return service.findPersona(id);
    }
}
