package com.insafe_assia.backend_amazon.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import net.h2.api.dao.CategorieRepository;
import net.h2.api.model.Categorie;
@CrossOrigin
@RestController
public class CategorieController {
	@Autowired
	private  CategorieRepository rep;
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/saveCategorie")
	public String saveCategorie(@RequestBody Categorie cat) {
		rep.save(cat);
		return "Categorie saved ..";
	}
	@GetMapping("/getAllCategorie")
	public List<Categorie> getAll(){
		return rep.findAll();
	}
	
	

}
