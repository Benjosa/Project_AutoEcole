package com.inti.Project_AutoEcole.Repository.Test;



import static org.assertj.core.api.Assertions.assertThat;

import java.sql.Date;
import java.util.List;

import com.inti.Project_AutoEcole.Model.Client;
import com.inti.Project_AutoEcole.Repository.ClientRepository;

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
public class ClientRepositoryTest 
{
	@Autowired
	ClientRepository clientRepository;
	
	Client c1,c2,c3;
	
	@BeforeEach
	public void setUp()
	{
		c1 = new Client();
		c2 = new Client("toto", "titi", Date.valueOf("2020-01-01"),"toto@toto", "rue des toto");
	}
	
	@Test
	public void testSaveClient()
	{
		
		// WHEN
		Client savedClient = clientRepository.save(c2);
		
		//THEN
		
		assertThat(savedClient).isNotNull();
		assertThat(savedClient.getNom()).isEqualTo("toto");
	}
	
	@Test
	public void testGetAllClient()
	{
		clientRepository.save(c2);
		
		// When
		List<Client> listeClient = clientRepository.findAll();
		
		// THEN
		assertThat(listeClient).isNotEmpty();
	}
	
	@Test
	public void testGetClient()
	{
		// When
		Client client = clientRepository.getReferenceById(2);
		
		//Then
		assertThat(client).isNotNull();
		assertThat(client.getNom()).isEqualTo("toto");
	}
	
}
