package com.inti.Project_AutoEcole.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor @AllArgsConstructor @RequiredArgsConstructor
public class Vehicule 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private @NonNull String marque;
	private @NonNull String plaqueImmatriculation;
	private @NonNull String boiteVitesse;
	
	
	@ManyToMany
	@JoinTable(name = "Formateur_Vehicule", joinColumns = @JoinColumn(name="idVehicule"),
	inverseJoinColumns = @JoinColumn(name="idFormateur"))
	List<Formateur> listeFormateur;
	

}
