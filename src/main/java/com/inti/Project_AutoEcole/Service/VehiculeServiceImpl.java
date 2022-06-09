package com.inti.Project_AutoEcole.Service;

import java.util.List;

import com.inti.Project_AutoEcole.Model.Vehicule;
import com.inti.Project_AutoEcole.Repository.VehiculeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehiculeServiceImpl implements VehiculeService {
	
	@Autowired
	VehiculeRepository vr;
	
	@Override
	public void saveVehicule(Vehicule v) {
		vr.save(v);
	}

	@Override
	public List<Vehicule> getVehicules() {
		
		return vr.findAll();	
		
	}

	@Override
	public void deleteVehicule(int id) {
		vr.deleteById(id);
		
	}

	@Override
	public void updateVehicule(Vehicule v) {
		vr.save(v);
		
	}

}
