package com.inti.Project_AutoEcole.Service;

import java.util.List;

import com.inti.Project_AutoEcole.Model.Formateur;

public interface FormateurService 
{
	Formateur saveFormateur(Formateur formateur);
	List<Formateur> getAllFormateur();
	Formateur updateFormateur(Formateur formateur);
	Formateur getFormateur(int id);
	void deleteFormateur(int id);

	
}
