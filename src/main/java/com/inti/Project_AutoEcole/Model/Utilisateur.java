package com.inti.Project_AutoEcole.Model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@NoArgsConstructor @AllArgsConstructor @RequiredArgsConstructor
public abstract class Utilisateur 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;
	private @NonNull String nom;
	private @NonNull String prenom;
	private @NonNull Date dateNaissance;
	private @NonNull String mail;
	private @NonNull String adresse;
	
	@ManyToOne
	@JoinColumn(name = "idRole")
	Role role;
	
	@ManyToOne
	@JoinColumn(name = "idAutoEcole")
	AutoEcole auto_Ecole;

}
