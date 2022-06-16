package com.inti.Project_AutoEcole.Repository;

import com.inti.Project_AutoEcole.Model.Vehicule;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculeRepository extends JpaRepository<Vehicule, Integer> {

	@Query(value = "select * from vehicule where plaque_immatriculation =:plaque", nativeQuery = true)
	Vehicule getVehiculeByPlaque(String plaque);
}
