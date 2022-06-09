package com.inti.Project_AutoEcole.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table
@Data
@NoArgsConstructor @AllArgsConstructor
public class CoursCode 
{
	@Id
	private int id;
	private @NonNull String nom;
	
	@ManyToOne
	@JoinColumn(name = "idAutoEcole")
	AutoEcole auto_Ecole;
}
