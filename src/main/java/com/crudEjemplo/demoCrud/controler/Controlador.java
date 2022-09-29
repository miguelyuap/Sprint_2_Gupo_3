package com.crudEjemplo.demoCrud.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crudEjemplo.demoCrud.interfaceService.IpersonaService;
import com.crudEjemplo.demoCrud.modelo.Persona;

@Controller
@RequestMapping
public class Controlador {
	
	@Autowired
	private IpersonaService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Persona> personas = service.listar();
		model.addAttribute("personas", personas);
		return "index";
	}
	
	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("persona", new Persona());
		return "form";
	}
	
	@PostMapping("/save")
	public String save(@Validated Persona p, Model model) {
		service.save(p);
		return "redirect:/listar";		
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Persona>persona = service.listarId(id);
		model.addAttribute("persona", persona);
		return "form";
	}
	
	@GetMapping("/eliminar/{id}")
	public String eliminar(@PathVariable int id, Model model) {
		service.delete(id);
		return "redirect:/listar";
	}
	
	
	
	@GetMapping("/compras")
	public String compras(Model model) {		
		return "/compras";
	}
	@GetMapping("/7cuenta")
	public String cuenta(Model model) {		
		return "/7cuenta";
	}
	@GetMapping("/index")
	public String listaUsuarios(Model model) {		
		return "/index";
	}
	@GetMapping("/1-1index")
	public String inicio(Model model) {		
		return "/1-1index";
	}
	@GetMapping("/3frutas")
	public String frutas(Model model) {		
		return "/3frutas";
	}
	@GetMapping("/4verduras_hortalizas")
	public String verduras(Model model) {		
		return "//4verduras_hortalizas";
	}
	@GetMapping("//5pulpas")
	public String pulpas(Model model) {		
		return "//5pulpas";
	}
	@GetMapping("/6hierbasAromaticas")
	public String hierbas(Model model) {		
		return "/6hierbasAromaticas";
	}
	

}
