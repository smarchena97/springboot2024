package com.apirest.simpleApiRest.service;

import com.apirest.simpleApiRest.entity.Persona;

import java.util.List;

public interface IPersonaService {

    void save(Persona persona);

    List<Persona> listPersonas();

    Persona findPersona(int id);
}
