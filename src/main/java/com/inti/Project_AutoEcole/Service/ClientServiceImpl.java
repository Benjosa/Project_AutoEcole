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
	ClientRepository clientRepository;

	@Override
	public void saveClient(Client admin) 
  
	public Client saveClient(Client admin) 
	{
		
		return clientRepository.save(admin);
		
	}

	@Override
	public List<Client> getAllClient() 
	{
		
		return clientRepository.findAll();
	}

	@Override
	public Client updateClient(Client admin) 
	{
		return clientRepository.save(admin);
		
	}

	@Override
	public Client getClient(int id) 
	{
		
		return clientRepository.getReferenceById(id);
	}

	@Override
	public void deleteClient(int id) 
	{
		clientRepository.deleteById(id);
		
	}
	
}
