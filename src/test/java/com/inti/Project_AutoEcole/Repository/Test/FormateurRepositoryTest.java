package com.inti.Project_AutoEcole.Repository.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.sql.Date;
import java.util.List;

import com.inti.Project_AutoEcole.Model.Formateur;
import com.inti.Project_AutoEcole.Repository.FormateurRepository;

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
public class FormateurRepositoryTest
{
	@Autowired
	FormateurRepository fr;
	
	Formateur f1,f2;
	
	@BeforeEach
	public void setUp()
	{
		f1 = new Formateur("toto", "titi", Date.valueOf("2020-01-01"),"toto@toto", "rue des toto");
		
	}
	
	@Test
	public void testSaveFormateur()
	{
		Formateur saveFormateur = fr.save(f1);
		
		assertThat(saveFormateur).isNotNull();
	}
	
	@Test
	public void testGetAllFormateur()
	{
		List<Formateur> listeFormateur = fr.findAll();
		
		assertThat(listeFormateur).isNotNull();
		assertThat(listeFormateur.get(0).getNom()).isEqualTo("test");
	}
	
	@Test
	public void testGetFormateur()
	{
		Formateur formateur = fr.getReferenceById(1);
		
		assertThat(formateur).isNotNull();
		assertThat(formateur.getNom()).isEqualTo("test");
		
	}
	
	@Test
	public void testUpdateFormateur()
	{
		f1.setNom("Oceane");
		
		Formateur formateurUpdate = fr.save(f1);
		
		assertThat(formateurUpdate).isNotNull();
		assertThat(formateurUpdate.getNom()).isEqualTo("Oceane");
	}
	
	
	
}
