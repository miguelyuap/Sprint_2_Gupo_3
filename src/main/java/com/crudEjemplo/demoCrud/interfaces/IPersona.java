package com.crudEjemplo.demoCrud.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crudEjemplo.demoCrud.modelo.Persona;

@Repository
public interface IPersona extends CrudRepository<Persona, Integer>{

}
