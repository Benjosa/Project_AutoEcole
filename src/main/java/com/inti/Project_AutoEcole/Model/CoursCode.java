package com.inti.Project_AutoEcole.Model;

import java.util.List;

import javax.persistence.Entity;
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

@Entity
@Table
@Data
@NoArgsConstructor @AllArgsConstructor
public class CoursCode 
{
	@Id
	private int id;
	private @NonNull String titre;
	
	@JsonIgnore
	@ManyToMany
	@JoinTable(name = "client_courscode", joinColumns = @JoinColumn(name="idCoursCode"),
	inverseJoinColumns = @JoinColumn(name="idClient"))
	List<Client> listeClient;
}
