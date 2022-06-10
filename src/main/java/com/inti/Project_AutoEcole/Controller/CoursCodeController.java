package com.inti.Project_AutoEcole.Controller;

import java.util.List;


import com.inti.Project_AutoEcole.Model.CoursCode;
import com.inti.Project_AutoEcole.Repository.CoursCodeRepository;
import com.inti.Project_AutoEcole.Service.CoursCodeService;

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
public class CoursCodeController {

	@Autowired
	CoursCodeService coursCodeService;
	
	@Autowired
	CoursCodeRepository coursCodeRepository;
	
	@GetMapping("/CoursCode")
	@CrossOrigin(origins = "*")
	public ResponseEntity<List<CoursCode>> getAllCours()
	{
		return new ResponseEntity<List<CoursCode>>(coursCodeService.getCours(), HttpStatus.OK);
		
	}
	
	@GetMapping("/CoursCode/{id}")
	public CoursCode getCourById(@PathVariable int id)
	{
		return coursCodeService.getCour(id);
	}
	
	@PostMapping("/saveCour")
	public ResponseEntity<CoursCode>saveCour(@RequestBody CoursCode coursCode)
	{
		return new ResponseEntity<CoursCode>(coursCodeService.saveCour(coursCode), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/deleteCour/{id}")
	public void deleteCour(@PathVariable int id)
	{
		coursCodeService.deleteCour(id);
	}
	

	@PutMapping("/updateCour")
	public CoursCode updateCour(@RequestBody CoursCode coursCode)
	{
		return coursCodeService.updateCour(coursCode);
	}
}
