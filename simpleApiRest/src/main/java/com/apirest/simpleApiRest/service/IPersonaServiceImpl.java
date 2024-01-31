package com.apirest.simpleApiRest.service;

import com.apirest.simpleApiRest.entity.Persona;
import com.apirest.simpleApiRest.repository.PersonaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IPersonaServiceImpl implements IPersonaService{

    private final PersonaRepository repository;

    public IPersonaServiceImpl(PersonaRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(Persona persona) {
        repository.save(persona);
    }

    @Override
    public List<Persona> listPersonas() {
        return (List<Persona>) repository.findAll();
    }

    @Override
    public Persona findPersona(int id) {
        return repository.findById(id).orElseThrow();
    }


}
