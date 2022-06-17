package com.inti.Project_AutoEcole.Service;

import java.util.List;

import com.inti.Project_AutoEcole.Model.Vehicule;

public interface VehiculeService {
	
	List<Vehicule> getVehicules();
	
	Vehicule getVehiculeById(int id);
	
	Vehicule saveVehicule (Vehicule v);
	
	void deleteVehicule (int id);
	
	Vehicule updateVehicule (Vehicule v);
	
	Vehicule getVehiculeByPlaque(String plaque);

}
