package com.inti.Project_AutoEcole.Repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import com.inti.Project_AutoEcole.Model.CoursCode;


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
public class CoursCodeRepositoryTests {


	@Autowired
	CoursCodeRepository ccr;
	
	CoursCode cours1, cours2, cours3 ;
	
	@BeforeEach
	public void setUp()
	{
		cours1 = new CoursCode();
		cours2 = new CoursCode(2, "cours2", null);
		cours3 = ccr.save(cours2);
	}
	
	@Test
	public void testSaveCour()
	{
		//when
		CoursCode savedCour = ccr.save(cours2);
		
		//Then
		assertThat(savedCour).isNotNull();
		assertThat(savedCour.getTitre()).isEqualTo("cours2");
		assertThat(savedCour.getId()).isGreaterThan(1);
				
	}
	
	@Test
	public void testUpdateCour() {
		//Given
	
		CoursCode c1 = ccr.save(cours2);;
		//When
		c1.setTitre("Cours3");
		CoursCode c2 = ccr.save(c1);
		//Then
		assertThat(c2).isNotNull();
		assertThat(c2.getTitre()).isEqualTo("Cours3");
		
	}
	
	
	@Test
	@Transactional(value = TxType.NEVER)
	public void TestDeleteSalarie()
	{
		try {
		// Given		
		
		int id = cours3.getId();
				
		CoursCode c1 = ccr.getReferenceById(id);
		assertThat(c1).isNotNull();
		
		// When		
		ccr.delete(c1);
		cours3 = ccr.getReferenceById(id);
			
		// Then
		assertThat(cours3).isNull();
		}
		catch (Exception e) {
			e.getStackTrace();
			// TODO: handle exception
		}
	}
	
	
	
	
	@Test
	public void testGetAllCours()
	{
	
		
		// When
		List<CoursCode> listeCours = ccr.findAll();
		
		// THEN
		assertThat(listeCours).isNotEmpty();
		assertThat(listeCours).hasSize((int) ccr.count());
		assertThat(listeCours.get(0).getClass()).hasSameClassAs(CoursCode.class);

	}
	
	@Test
	public void testGetCour()
	{
		
		
		// When
		CoursCode c1 = ccr.getReferenceById(cours3.getId());
		
		//Then
		assertThat(c1).isNotNull();
		assertThat(c1.getId()).isEqualTo(cours3.getId()); 
		assertThat(c1.getTitre()).isEqualTo(cours3.getTitre());
	}
}
