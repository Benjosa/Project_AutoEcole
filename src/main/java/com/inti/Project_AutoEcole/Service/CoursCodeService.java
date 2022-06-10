package com.inti.Project_AutoEcole.Service;

import java.util.List;

import com.inti.Project_AutoEcole.Model.CoursCode;

public interface CoursCodeService {

	CoursCode saveCour(CoursCode coursCode);
	
	CoursCode updateCour (CoursCode coursCode);
	
	void deleteCour(int id);
	
	List<CoursCode> getCours();
	
	CoursCode getCour(int id);
	
	
}
