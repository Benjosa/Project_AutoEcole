package com.inti.Project_AutoEcole.Controller;

import java.util.List;

import com.inti.Project_AutoEcole.Model.Client;
import com.inti.Project_AutoEcole.Service.ClientService;

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
public class ClientController {

	@Autowired
	ClientService us;
	
	@GetMapping("/clients")
	public ResponseEntity<List<Client>> getAllClients()
	{
		return new ResponseEntity<List<Client>>(us.getAllClient(),HttpStatus.OK);
	}
	
	@GetMapping("/client/{id}")
	public ResponseEntity<Client> getClient(@PathVariable int id)
	{
		return new ResponseEntity<Client>(us.getClient(id),HttpStatus.OK);
	}
	
	@PostMapping("/saveClient")
	public ResponseEntity<Client> saveClient(@RequestBody Client u)
	{
		return new ResponseEntity<Client>(us.saveClient(u),HttpStatus.CREATED);
	}
	
	@DeleteMapping("/deleteClient/{id}")
	public void deleteClient(@PathVariable int id)
	{
		us.deleteClient(id);
	}
	
	@PutMapping("/updateClient")
	public Client updateClient(@RequestBody Client u)
	{
		return us.updateClient(u);
	}
}
