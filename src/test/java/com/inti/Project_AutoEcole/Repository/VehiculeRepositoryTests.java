package com.inti.Project_AutoEcole.Repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import com.inti.Project_AutoEcole.Model.Vehicule;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class VehiculeRepositoryTests {

	@Autowired
	VehiculeRepository vehiculeRepository;
	
	Vehicule v1, v2, v3;
	
	@BeforeEach
	public void setUp()
	{
		v1 = new Vehicule();
		v2 = new Vehicule(4, "Peugeot 2008", "AA-123-BB", "Automatique");
	}
	
	@Test
	public void testSaveVehicule()
	{
		
		// WHEN
		Vehicule savedVehicule = vehiculeRepository.save(v2);
		
		// THEN
		
		assertThat(savedVehicule).isNotNull();
		assertThat(savedVehicule.getMarque()).isEqualTo("Peugeot 2008");
	}
	
	@Test
	public void testGetAllVehicules()
	{
		vehiculeRepository.save(v2);
		
		// WHEN
		List<Vehicule> listeVehicule = vehiculeRepository.findAll();
		
		// THEN
		assertThat(listeVehicule).isNotEmpty();
	}
	
	@Test
	public void testGetVehicules()
	{
		vehiculeRepository.save(v2);
		
		// WHEN
		Vehicule vehicule = vehiculeRepository.getReferenceById(1);
		
		// THEN
		assertThat(vehicule).isNotNull();
		assertThat(vehicule.getMarque()).isEqualTo("Peugeot 2008");
	}
	
	@Test
	public void testDeleteVehicule()
	{
		vehiculeRepository.save(v2);
		int id = 2;
		
		// WHEN
		vehiculeRepository.deleteById(id);
		
		// THEN
		assertThat(vehiculeRepository.existsById(id)).isFalse();
	}
	
	@Test
	public void testUpdateVehicule() {
		// Given
		vehiculeRepository.save(v2);
		Vehicule vv1 = vehiculeRepository.getReferenceById(3);
		
		// WHEN
		vv1.setMarque("Mercedes");
		Vehicule vv = vehiculeRepository.save(vv1);
		
		// THEN
		assertThat(vv).isNotNull();
		assertThat(vv.getMarque()).isEqualTo("Mercedes");
	}
}
