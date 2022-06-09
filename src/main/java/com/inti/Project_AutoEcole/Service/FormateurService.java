package com.inti.Project_AutoEcole.Service;

import java.util.List;

import com.inti.Project_AutoEcole.Model.Formateur;

public interface FormateurService 
{
	void saveFormateur(Formateur formateur);
	List<Formateur> getAllFormateur();
	void updateClient(Formateur formateur);
	Formateur getCLient(int id);
	void deleteClient(int id);

	
}
