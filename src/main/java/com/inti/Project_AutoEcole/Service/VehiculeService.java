package com.inti.Project_AutoEcole.Service;

import java.util.List;

import com.inti.Project_AutoEcole.Model.Vehicule;

public interface VehiculeService {
	
	List<Vehicule> getVehicules();
	
	void saveVehicule (Vehicule v);
	
	void deleteVehicule (int id);
	
	void updateVehicule (Vehicule v);

}
