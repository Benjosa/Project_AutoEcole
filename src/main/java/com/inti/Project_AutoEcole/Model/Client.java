package com.inti.Project_AutoEcole.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor @NoArgsConstructor
public class Client extends Utilisateur 
{
	
	@ManyToMany
	@JoinTable(name = "Formateur_Client", joinColumns = @JoinColumn(name="idClient"),
	inverseJoinColumns = @JoinColumn(name="idFormateur"))
	List<Formateur> listeFormateur;

}
