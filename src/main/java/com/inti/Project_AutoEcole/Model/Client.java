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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table
@Data
@NoArgsConstructor @RequiredArgsConstructor @AllArgsConstructor
public class Client 
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
	@JoinTable(name = "Formateur_Client", joinColumns = @JoinColumn(name="idClient"),
	inverseJoinColumns = @JoinColumn(name="idFormateur"))
	List<Formateur> listeFormateur;
	
	@ManyToMany
	@JoinTable(name = "client_courscode", joinColumns = @JoinColumn(name="idClient"),
	inverseJoinColumns = @JoinColumn(name="idCoursCode"))
	List<CoursCode> listeCode;
	
	@ManyToOne
	@JoinColumn(name = "idForfait")
	Forfait forfait;
	
	
	


	
	@ManyToMany
	@JoinTable(name = "client_courscode", joinColumns = @JoinColumn(name="idClient"),
	inverseJoinColumns = @JoinColumn(name="idCoursCode"))
	List<CoursCode> listeCode;
	
	@ManyToOne
	@JoinColumn(name = "idForfait")
	Forfait forfait;
	
	
	
	
	@ManyToMany
	@JoinTable(name = "client_courscode", joinColumns = @JoinColumn(name="idClient"),
	inverseJoinColumns = @JoinColumn(name="idCoursCode"))
	List<CoursCode> listeCode;
	
	@ManyToOne
	@JoinColumn(name = "idForfait")
	Forfait forfait;
	
	
	

}
