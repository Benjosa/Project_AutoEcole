package com.inti.Project_AutoEcole.Service;

import java.util.List;

import com.inti.Project_AutoEcole.Model.CoursCode;

public interface CoursCodeService {

	void saveCour(CoursCode cc);
	
	void updateCour (CoursCode cc);
	
	void deleteCour(int id);
	
	List<CoursCode> getCours();
	
	CoursCode getCour(int id);
	
	
}
