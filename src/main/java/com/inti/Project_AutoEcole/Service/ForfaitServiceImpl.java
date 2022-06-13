package com.inti.Project_AutoEcole.Service;

import java.util.List;

import com.inti.Project_AutoEcole.Model.Forfait;
import com.inti.Project_AutoEcole.Repository.ForfaitRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ForfaitServiceImpl implements ForfaitService{

	@Autowired
	ForfaitRepository forfaitRepository;
	
	@Override
	public Forfait saveForfait(Forfait forfait) {
		// TODO Auto-generated method stub
		return forfaitRepository.save(forfait);
	}

	@Override
	public List<Forfait> getAllForfait() {
		return forfaitRepository.findAll();
	}

	@Override
	public Forfait updateForfait(Forfait forfait) {
		return forfaitRepository.save(forfait);
	}

	@Override
	public Forfait getForfait(int id) {
		return forfaitRepository.getReferenceById(id);
	}

	@Override
	public void deleteForfait(int id) {
		forfaitRepository.deleteById(id);
	}

}
