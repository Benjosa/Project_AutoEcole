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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor @RequiredArgsConstructor @AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer"})
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
	

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "idRole")
	Role role;
	
	@JsonIgnore
	@ManyToMany
	@JoinTable(name = "Formateur_Client", joinColumns = @JoinColumn(name="idClient"),
	inverseJoinColumns = @JoinColumn(name="idFormateur"))
	List<Formateur> listeFormateur;
	
	@JsonIgnore
	@ManyToMany
	@JoinTable(name = "client_courscode", joinColumns = @JoinColumn(name="idClient"),
	inverseJoinColumns = @JoinColumn(name="idCoursCode"))
	List<CoursCode> listeCoursCode;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "idForfait")
	Forfait forfait;
	

}
