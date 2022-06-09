package com.inti.Project_AutoEcole.Service;

import java.util.List;

import com.inti.Project_AutoEcole.Model.Formateur;
import com.inti.Project_AutoEcole.Repository.FormateurRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormateurServiceImpl implements FormateurService
{
	
	@Autowired
	FormateurRepository fr;

	@Override
	public void saveFormateur(Formateur formateur) 
	{
		fr.save(formateur);
		
	}

	@Override
	public List<Formateur> getAllFormateur() 
	{
		
		return fr.findAll();
	}

	@Override
	public void updateClient(Formateur formateur) 
	{
		fr.save(formateur);
		
	}

	@Override
	public Formateur getCLient(int id) 
	{
		
		return fr.getReferenceById(id);
	}

	@Override
	public void deleteClient(int id) 
	{
		fr.deleteById(id);
		
	}

}
