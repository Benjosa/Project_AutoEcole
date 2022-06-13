package com.inti.Project_AutoEcole.Service;

import java.util.List;
import com.inti.Project_AutoEcole.Model.SeanceConduite;

public interface SeanceConduiteService {

	SeanceConduite saveSeance(SeanceConduite seanceConduite);
	
	SeanceConduite updateSeance (SeanceConduite seanceConduite);
	
	void deleteSeance(int id);
	
	List<SeanceConduite> getSeances();
	
	SeanceConduite getSeance(int id);
	
}
