package com.inti.Project_AutoEcole.Service;


import java.util.List;

import com.inti.Project_AutoEcole.Model.Client;
import com.inti.Project_AutoEcole.Repository.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService 
{
	@Autowired
	ClientRepository clienRepository;

	@Override
	public void saveClient(Client admin) 
	{
		
		clienRepository.save(admin);
		
	}

	@Override
	public List<Client> getAllClient() 
	{
		
		return clienRepository.findAll();
	}

	@Override
	public void updateClient(Client admin) 
	{
		clienRepository.save(admin);
		
	}

	@Override
	public Client getCLient(int id) 
	{
		
		return clienRepository.getReferenceById(id);
	}

	@Override
	public void deleteClient(int id) 
	{
		clienRepository.deleteById(id);
		
	}
	
}
