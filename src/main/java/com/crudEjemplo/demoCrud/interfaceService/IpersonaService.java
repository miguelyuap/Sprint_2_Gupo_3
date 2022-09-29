package com.crudEjemplo.demoCrud.interfaceService;

import java.util.List;
import java.util.Optional;

import com.crudEjemplo.demoCrud.modelo.Persona;

public interface IpersonaService {
	public List<Persona>listar();
	public Optional<Persona>listarId(int id);
	public int save(Persona p);
	public void delete(int id);
}
