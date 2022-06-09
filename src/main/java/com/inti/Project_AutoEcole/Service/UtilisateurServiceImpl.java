package com.inti.Project_AutoEcole.Service;

import java.util.List;

import com.inti.Project_AutoEcole.Model.Utilisateur;
import com.inti.Project_AutoEcole.Repository.UtilisateurRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {

	@Autowired
	UtilisateurRepository utilisateurRepository;
	
	@Override
	public Utilisateur saveUtilisateur(Utilisateur u) {
		return utilisateurRepository.save(u);
	}

	@Override
	public void delete(int id) {
		utilisateurRepository.deleteById(id);
	}

	@Override
	public List<Utilisateur> getAllUtilisateurs() {
		return utilisateurRepository.findAll();
	}

	@Override
	public Utilisateur updateUtilisateur(Utilisateur u) {
		return utilisateurRepository.save(u);
	}

}
