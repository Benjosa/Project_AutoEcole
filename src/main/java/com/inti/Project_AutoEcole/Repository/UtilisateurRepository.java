package com.inti.Project_AutoEcole.Repository;

import com.inti.Project_AutoEcole.Model.Utilisateur;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {

}
