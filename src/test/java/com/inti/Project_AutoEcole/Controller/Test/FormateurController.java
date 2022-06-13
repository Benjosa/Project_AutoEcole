package com.inti.Project_AutoEcole.Controller.Test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.sql.Date;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.inti.Project_AutoEcole.Json;
import com.inti.Project_AutoEcole.Model.Formateur;
import com.inti.Project_AutoEcole.Service.FormateurService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(com.inti.Project_AutoEcole.Controller.FormateurController.class)
public class FormateurController 
{
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private FormateurService fs;
	
	@Test
	public void testGetAllFormateur()
	{
		try 
		{
			mockMvc.perform(get("/formateur"))
			.andExpect(status().isOk());
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetFormateur()
	{
		try 
		{
			mockMvc.perform(get("/formateur").param("id", "1"))
			.andExpect(status().isOk());
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testAjouterFormateur()
	{
		try 
		{
			mockMvc.perform(post("/ajouterFormateur")
					.contentType(MediaType.APPLICATION_JSON)
					.content(Json.fromObject(new Formateur("test", "test", Date.valueOf("2010-01-01"), "test@test", "rue des test"))))
					.andExpect(status().isCreated());
			
		} 
		catch (JsonProcessingException e)
		{
			e.printStackTrace();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	

}
