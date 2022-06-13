package com.inti.Project_AutoEcole.Service;

import java.util.List;

import com.inti.Project_AutoEcole.Model.Forfait;

public interface ForfaitService {

	Forfait saveForfait(Forfait forfait);
	List<Forfait> getAllForfait();
	Forfait updateForfait(Forfait forfait);
	Forfait getForfait(int id);
	void deleteForfait(int id);
}
