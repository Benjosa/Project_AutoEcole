package com.inti.Project_AutoEcole.Controller;

import java.util.List;

import com.inti.Project_AutoEcole.Model.Forfait;
import com.inti.Project_AutoEcole.Service.ForfaitService;

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
public class ForfaitController {

	@Autowired
	ForfaitService forfaitService;
	
	@GetMapping("/forfaits")
	public ResponseEntity<List<Forfait>> getAllForfaits()
	{
		return new ResponseEntity<List<Forfait>>(forfaitService.getAllForfait(),HttpStatus.OK);
	}
	
	@GetMapping ("/forfait/{id}")
	public ResponseEntity<Forfait> getForfait(@PathVariable int id)
	{
		return new ResponseEntity<Forfait>(forfaitService.getForfait(id),HttpStatus.OK);
	}
	
	@PostMapping ("/saveForfait")
	public ResponseEntity<Forfait> saveForfait(@RequestBody Forfait forfait)
	{
		return new ResponseEntity<Forfait>(forfaitService.saveForfait(forfait),HttpStatus.CREATED);
	}
	
	@DeleteMapping ("/deleteForfait/{id}")
	public void deleteForfiat(@PathVariable int id)
	{
		forfaitService.deleteForfait(id);
	}
	
	@PutMapping ("/updateForfait")
	public Forfait updateForfait(@RequestBody Forfait forfait)
	{
		return forfaitService.updateForfait(forfait);
	}
}
