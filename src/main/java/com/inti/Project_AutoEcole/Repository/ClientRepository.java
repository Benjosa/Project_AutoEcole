package com.inti.Project_AutoEcole.Repository;


import com.inti.Project_AutoEcole.Model.Client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> 
{

	@Query(value = "select * from client where nom =:nom", nativeQuery = true)
	Client getClientByNom(String nom);
}
