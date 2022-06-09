package com.inti.Project_AutoEcole.Controller;

import java.util.List;

import com.inti.Project_AutoEcole.Model.Vehicule;
import com.inti.Project_AutoEcole.Service.VehiculeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class VehiculeController {
	
	@Autowired
	VehiculeService vs;
	
	@GetMapping("/vehicule")
	@CrossOrigin(origins = "*")
	public ResponseEntity<List<Vehicule>> getAllVehicule()
	{
		return new ResponseEntity<List<Vehicule>>(vs.getVehicules(), HttpStatus.OK);
	}

}
