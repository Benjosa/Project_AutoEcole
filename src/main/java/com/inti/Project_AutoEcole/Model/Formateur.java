package com.inti.Project_AutoEcole.Model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor @RequiredArgsConstructor @AllArgsConstructor
public class Formateur 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private @NonNull String nom;
	private @NonNull String prenom;
	private @NonNull Date dateNaissance;
	private @NonNull String mail;
	private @NonNull String adresse;
	
	@ManyToOne
	@JoinColumn(name = "idRole")
	Role role;
	
	@ManyToMany
	@JoinTable(name = "Formateur_Client", joinColumns = @JoinColumn(name="idFormateur"),
	inverseJoinColumns = @JoinColumn(name="idClient"))
	List<Client> listeClient;
	
	@ManyToMany
	@JoinTable(name = "Formateur_Vehicule", joinColumns = @JoinColumn(name="idFormateur"),
	inverseJoinColumns = @JoinColumn(name="idVehicule"))
	List<Vehicule> listeVehicule;

}
