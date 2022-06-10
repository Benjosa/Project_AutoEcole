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
	public List<Vehicule> getVehicules()
	{
		return vr.findAll();	
	}
	
	@Override
	public Vehicule getVehiculeById(int id)
	{
		return vr.getReferenceById(id);
	}
	
	@Override
	public Vehicule saveVehicule(Vehicule v)
	{
		return vr.save(v);
	}

	@Override
	public void deleteVehicule(int id)
	{
		vr.deleteById(id);
	}

	@Override
	public Vehicule updateVehicule(Vehicule v)
	{
		return vr.save(v);
	}

}
