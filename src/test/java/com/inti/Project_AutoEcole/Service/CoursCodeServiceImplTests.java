package com.inti.Project_AutoEcole.Service;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import com.inti.Project_AutoEcole.Model.CoursCode;
import com.inti.Project_AutoEcole.Repository.CoursCodeRepository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;



@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CoursCodeServiceImplTests {

	
	@SpyBean
	CoursCodeServiceImpl ccsit;


	@Autowired
	CoursCodeRepository ccr;
	
	
	CoursCode cours1, cours2, cours3 ;
	
	@BeforeEach
	public void setUp()
	{
		cours1 = new CoursCode();
		cours2 = new CoursCode(2, "cours2", null);
		cours3 = ccsit.saveCour(cours2);
	}
	@Test
	public void testSaveCourWithService()
	{
		CoursCode savedCour = ccsit.saveCour(cours2);
		
		assertThat(savedCour).isNotNull();
		assertThat(savedCour.getTitre()).isEqualTo("cours2");
		assertThat(savedCour.getId()).isGreaterThan(1);
	}
	
	@Test
	public void testUpdateCourWithService() {
		//Given
	
		CoursCode c1 = ccsit.updateCour(cours2);;
		//When
		c1.setTitre("Cours3");
		CoursCode c2 = ccsit.updateCour(c1);
		//Then
		assertThat(c2).isNotNull();
		assertThat(c2.getTitre()).isEqualTo("Cours3");
		
	}
	
	
	@Test
	@Transactional(value = TxType.NEVER)
	public void TestDeleteSalarieWithService()
	{
		try {
		// Given		
		
		int id = cours3.getId();
				
		CoursCode c1 = ccr.getReferenceById(id);
		assertThat(c1).isNotNull();
		
		// When		
		ccsit.deleteCour(id);
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
	public void testGetAllCoursWithService()
	{
	
		
		// When
		List<CoursCode> listeCours = ccsit.getCours();
		
		// THEN
		assertThat(listeCours).isNotEmpty();
		assertThat(listeCours).hasSize((int) ccr.count());
		assertThat(listeCours.get(0).getClass()).hasSameClassAs(CoursCode.class);

	}
	
	

	@Test
	public void testGetCourWithService()
	{
		
		
		// When
		CoursCode c1 = ccsit.getCour(1);
		
		//Then
		assertThat(c1).isNotNull();
		assertThat(c1.getId()).isEqualTo(1); 
		assertThat(c1.getTitre()).isEqualTo(ccsit.getCour(1).getTitre());
	}
	
}
