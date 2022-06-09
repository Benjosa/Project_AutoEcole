package com.inti.Project_AutoEcole.Model;

import java.util.List;

import javax.persistence.Entity;
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
@NoArgsConstructor @AllArgsConstructor
public class CoursCode 
{
	@Id
	private int id;
	private @NonNull String nom;
	
	@ManyToMany
	@JoinTable(name = "client_courscode", joinColumns = @JoinColumn(name="idCoursCode"),
	inverseJoinColumns = @JoinColumn(name="idClient"))
	List<Client> listeClient;
}
