package com.inti.Project_AutoEcole.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table
@Data
@AllArgsConstructor @NoArgsConstructor
public class Role 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private @NonNull String nomRole;
	
	@OneToMany(mappedBy = "role")
	List<Formateur> listeFormateur;
	
	@OneToMany(mappedBy = "role")
	List<Client> listeClient;

}
