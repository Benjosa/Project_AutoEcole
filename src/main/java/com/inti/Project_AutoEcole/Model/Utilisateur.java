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
	protected @NonNull String nom;
	protected @NonNull String prenom;
	protected @NonNull Date dateNaissance;
	protected @NonNull String mail;
	protected @NonNull String adresse;
	
	@ManyToOne
	@JoinColumn(name = "idRole")
	Role role;

}
