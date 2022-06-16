package com.inti.Project_AutoEcole.Service;

import java.util.List;

import com.inti.Project_AutoEcole.Model.Client;

public interface ClientService 
{
	Client saveClient(Client client);
	List<Client> getAllClient();
	Client updateClient(Client client);
	Client getClient(int id);
	Client getClientByNom(String nom);
	void deleteClient(int id);

}
