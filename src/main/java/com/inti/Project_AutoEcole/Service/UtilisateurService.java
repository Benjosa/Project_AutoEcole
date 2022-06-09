package com.inti.Project_AutoEcole.Service;

import java.util.List;

import com.inti.Project_AutoEcole.Model.Utilisateur;

public interface UtilisateurService {
	Utilisateur saveUtilisateur(Utilisateur u);
	void delete(int id);
	List<Utilisateur> getAllUtilisateurs();
	Utilisateur updateUtilisateur(Utilisateur u);
}
