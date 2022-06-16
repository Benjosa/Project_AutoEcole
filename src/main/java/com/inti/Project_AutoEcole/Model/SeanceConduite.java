package com.inti.Project_AutoEcole.Model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table
@Data

@NoArgsConstructor @AllArgsConstructor @RequiredArgsConstructor
public class SeanceConduite 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private @NonNull Date dateSeance;
	private @NonNull Time heureDebutSeance;
	private @NonNull Time heureFinSeance;
	
	
	@OneToOne
	@JoinColumn(name = "idVehicule")
	Vehicule vehicule;

	
	@OneToOne
	@JoinColumn(name = "idClient")
	Client client;
	
	
	@OneToOne
	@JoinColumn(name = "idFormateur")
	Formateur formateur;

}
