package com.inti.Project_AutoEcole.Controller;

import java.util.List;
import com.inti.Project_AutoEcole.Model.SeanceConduite;
import com.inti.Project_AutoEcole.Service.FormateurService;
import com.inti.Project_AutoEcole.Service.SeanceConduiteService;
import com.inti.Project_AutoEcole.Service.VehiculeService;

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
public class SeanceConduiteController {

	@Autowired
	SeanceConduiteService seanceConduiteService;
	
	@Autowired
	VehiculeService vehiculeService;
	
	@Autowired
	FormateurService formateurService;
	
	@GetMapping("/SeanceConduite")
	@CrossOrigin(origins = "*")
	public ResponseEntity<List<SeanceConduite>> getAllSeances()
	{
		return new ResponseEntity<List<SeanceConduite>>(seanceConduiteService.getSeances(), HttpStatus.OK);
	}
	
	@GetMapping("/SeanceConduite/{id}")
	public SeanceConduite getSeanceById(@PathVariable int id)
	{
		return seanceConduiteService.getSeance(id);
	}
	
	@PostMapping("/saveSeance")
	public ResponseEntity<SeanceConduite>saveSeance(@RequestBody SeanceConduite seanceConduite)
	{
		return new ResponseEntity<SeanceConduite>(seanceConduiteService.saveSeance(seanceConduite), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/deleteSeance/{id}")
	public void deleteSeance(@PathVariable int id)
	{
		seanceConduiteService.deleteSeance(id);
	}
	

	@PutMapping("/updateSeance")
	public SeanceConduite updateSeance(@RequestBody SeanceConduite seanceConduite)
	{
		return seanceConduiteService.updateSeance(seanceConduite);
	}
	
	@PostMapping("/associerSeance/{idVehicule}/{idFormateur}")
	public ResponseEntity<SeanceConduite>associerSeance(@RequestBody SeanceConduite seanceConduite,@PathVariable int idVehicule,@PathVariable int idFormateur)
	{
		seanceConduite.setVehicule(vehiculeService.getVehiculeById(idVehicule));
		seanceConduite.setFormateur(formateurService.getFormateur(idFormateur));
		System.out.println("Seance :" +seanceConduite);
		return new ResponseEntity<SeanceConduite>(seanceConduiteService.saveSeance(seanceConduite), HttpStatus.CREATED);
	}
}
