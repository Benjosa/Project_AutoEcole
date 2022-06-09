package com.inti.Project_AutoEcole.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table
@Data
@NoArgsConstructor @AllArgsConstructor
public class AutoEcole 
{
	private @NonNull String nom;
	
	@OneToMany(mappedBy = "autoEcole")
	List<Vehicule> listeVehicule;
	
	@OneToMany(mappedBy = "autoE")
	List<Forfait> listeForfait;
	
	@OneToMany(mappedBy = "auto_Ecole")
	List<CoursCode> listeCoursCode;
	
	

}
