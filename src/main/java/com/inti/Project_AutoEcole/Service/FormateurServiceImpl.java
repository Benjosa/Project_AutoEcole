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
	public Formateur saveFormateur(Formateur formateur) 
	{
		return fr.save(formateur);
		
	}

	@Override
	public List<Formateur> getAllFormateur() 
	{
		
		return fr.findAll();
	}

	@Override
	public Formateur updateFormateur(Formateur formateur) 
	{
		return fr.save(formateur);
		
	}

	@Override
	public Formateur getFormateur(int id) 
	{
		
		return fr.getReferenceById(id);
	}

	@Override
	public void deleteFormateur(int id) 
	{
		fr.deleteById(id);
		
	}

}
