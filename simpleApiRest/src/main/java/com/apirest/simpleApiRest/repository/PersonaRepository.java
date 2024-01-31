package com.apirest.simpleApiRest.repository;

import com.apirest.simpleApiRest.entity.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends CrudRepository<Persona,Integer> {
}
