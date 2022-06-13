package com.inti.Project_AutoEcole.Service;

import java.util.List;
import com.inti.Project_AutoEcole.Model.SeanceConduite;
import com.inti.Project_AutoEcole.Repository.SeanceConduiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeanceConduiteServiceImpl implements SeanceConduiteService{

	@Autowired
	SeanceConduiteRepository seanceConduiteRepository;
	
	@Override
	public SeanceConduite saveSeance(SeanceConduite seanceConduite) 
	{
		return seanceConduiteRepository.save(seanceConduite);
	}

	@Override
	public SeanceConduite updateSeance(SeanceConduite seanceConduite) 
	{
		return seanceConduiteRepository.save(seanceConduite);
	}

	@Override
	public void deleteSeance(int id) 
	{
		seanceConduiteRepository.deleteById(id);
	}

	@Override
	public List<SeanceConduite> getSeances() {
		return seanceConduiteRepository.findAll();
		}

	@Override
	public SeanceConduite getSeance(int id) 
	{
	return seanceConduiteRepository.getReferenceById(id);
	}

}
