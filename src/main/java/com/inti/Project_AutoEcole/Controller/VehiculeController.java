package com.inti.Project_AutoEcole.Controller;

import java.util.List;

import com.inti.Project_AutoEcole.Model.Vehicule;
import com.inti.Project_AutoEcole.Repository.VehiculeRepository;
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
@CrossOrigin(origins = "*")
public class VehiculeController {
	
	@Autowired
	VehiculeService vs;
	
//	@Autowired
//	VehiculeRepository vr;
	
	@GetMapping("/vehicule")
	public ResponseEntity<List<Vehicule>> getAllVehicule()
	{
		System.out.println(vs.getVehicules());
		return new ResponseEntity<List<Vehicule>>(vs.getVehicules(), HttpStatus.OK);
	}
	
	@PostMapping("/enrVehicule")
	public ResponseEntity<Vehicule> saveVehicule(@RequestBody Vehicule vehicule)
	{
		return new ResponseEntity<Vehicule>(vs.saveVehicule(vehicule), HttpStatus.CREATED);	
	}
	
//	@GetMapping("/enrVehicule")
//	public void saveVehicule(@RequestBody Vehicule vehicule)
//	{
//		vs.saveVehicule(vehicule);
//	}
	
	
	@DeleteMapping("/supprVehicule/{id}")
	public void deleteVehicule(@PathVariable("id") int id)
	{
		vs.deleteVehicule(id);
	}
	
	@GetMapping("/vehicule/{id}")
	public Vehicule getVehiculeById(@PathVariable int id)
	{
		return vs.getVehiculeById(id);
	}
	
	@PutMapping("modifierVehicule")
	public Vehicule updateVehicule(@RequestBody Vehicule vehicule)
	{
		return vs.updateVehicule(vehicule);
	}
	
	
	

}
