package com.inti.Project_AutoEcole.Service;

import java.util.List;

import com.inti.Project_AutoEcole.Model.Client;

public interface ClientService 
{
	void saveAdmin(Client client);
	List<Client> getAllAdmin();
	void updateAdmin(Client client);
	Client getAdmin(int id);
	void deleteAdmin(int id);

}
