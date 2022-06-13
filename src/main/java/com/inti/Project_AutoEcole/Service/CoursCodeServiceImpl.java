package com.inti.Project_AutoEcole.Service;

import java.util.List;

import com.inti.Project_AutoEcole.Model.CoursCode;
import com.inti.Project_AutoEcole.Repository.CoursCodeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoursCodeServiceImpl implements CoursCodeService{

	@Autowired
	CoursCodeRepository coursCodeRepository;
	
	@Override
	public CoursCode saveCour(CoursCode coursCode)
	{
		return coursCodeRepository.save(coursCode);
	}

	@Override
	public CoursCode updateCour(CoursCode coursCode) 
	{
		return coursCodeRepository.save(coursCode);
	}

	@Override
	public void deleteCour(int id) 
	{
		coursCodeRepository.deleteById(id);
	}

	@Override
	public List<CoursCode> getCours() {
		return coursCodeRepository.findAll();
	}

	@Override
	public CoursCode getCour(int id) {
		return coursCodeRepository.getReferenceById(id);
	}
	
}
