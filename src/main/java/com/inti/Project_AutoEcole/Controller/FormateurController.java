package com.inti.Project_AutoEcole.Controller;

import java.util.List;

import com.inti.Project_AutoEcole.Model.Formateur;
import com.inti.Project_AutoEcole.Service.FormateurService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class FormateurController 
{
	@Autowired
	FormateurService formateurService;
	
	@GetMapping("/formateur")
	public ResponseEntity<List<Formateur>> getAllFormateur()
	{
		return new ResponseEntity<List<Formateur>>(formateurService.getAllFormateur(), HttpStatus.OK);
	}
	
	@GetMapping("/formateur/{id}")
	public ResponseEntity<Formateur> getFormateur(@PathVariable int id)
	{
		return new ResponseEntity<Formateur>(formateurService.getFormateur(id), HttpStatus.OK);
	}
	
	
	@PostMapping("/ajouterFormateur")
	public ResponseEntity<Formateur> ajouterFormateur(@RequestBody Formateur formateur)
	{
		return new ResponseEntity<Formateur>(formateurService.saveFormateur(formateur),HttpStatus.CREATED);
	}
	
	
	
	@DeleteMapping("/deleteFormateur/{id}")
	public void deleteFormateur(@PathVariable int id)
	{
		formateurService.deleteFormateur(id);
	}
	
	@PutMapping("/updateFormateur")
	public Formateur updateFormateur(@RequestBody Formateur formateur)
	{
		return formateurService.updateFormateur(formateur);
	}
	

}
