package com.inti.Project_AutoEcole.Repository;

import com.inti.Project_AutoEcole.Model.Formateur;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FormateurRepository extends JpaRepository<Formateur, Integer>
{
	@Query(value = "select * from formateur where nom =:nom", nativeQuery = true)
	Formateur getFormateurByNom(String nom);

}
