package com.inti.Project_AutoEcole.Service;

import java.util.List;

import com.inti.Project_AutoEcole.Model.Client;

public interface ClientService 
{
	void saveClient(Client client);
	List<Client> getAllClient();
	void updateClient(Client client);
	Client getCLient(int id);
	void deleteClient(int id);

}
