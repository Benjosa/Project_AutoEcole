package com.inti.Project_AutoEcole.Controller;

import java.util.List;

import com.inti.Project_AutoEcole.Model.Utilisateur;
import com.inti.Project_AutoEcole.Service.UtilisateurService;

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
@CrossOrigin(origins = {"http://localhost:4200"})
public class UtilisateurController {

	@Autowired
	UtilisateurService us;
	
	@GetMapping("/utilisateurs")
	public ResponseEntity<List<Utilisateur>> getAllUtilisateurs()
	{
		return new ResponseEntity<List<Utilisateur>>(us.getAllUtilisateurs(),HttpStatus.OK);
	}
	
	@PostMapping("/saveUtilisateur")
	public ResponseEntity<Utilisateur> saveUtilisateur(@RequestBody Utilisateur u)
	{
		return new ResponseEntity<Utilisateur>(us.saveUtilisateur(u),HttpStatus.CREATED);
	}
	
	@DeleteMapping("/deleteUtilisateur/{id}")
	public void deleteUtilisateur(@PathVariable int id)
	{
		us.delete(id);
	}
	
	@PutMapping("/updateUtilisateur")
	public Utilisateur updateUtilisateur(@RequestBody Utilisateur u)
	{
		return us.updateUtilisateur(u);
	}
}
