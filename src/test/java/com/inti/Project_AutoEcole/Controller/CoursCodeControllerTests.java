package com.inti.Project_AutoEcole.Controller;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.sql.Date;

import com.inti.Project_AutoEcole.Json;
import com.inti.Project_AutoEcole.Model.CoursCode;
import com.inti.Project_AutoEcole.Service.CoursCodeService;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(controllers = CoursCodeController.class)
public class CoursCodeControllerTests {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private CoursCodeService coursCodeService;
	
	@Test
	@DisplayName("Test affichage des cours")
	public void testAffichageAllCours()
	{
		try {
			mockMvc.perform(get("/CoursCode"))
			.andExpect(status().isOk())
			.andDo(print());
			;	
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetCour()
	{
		try 
		{
			mockMvc.perform(get("/CoursCode").param("id", "1"))
			.andExpect(status().isOk());
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	@DisplayName("Test save cours")
	public void testSaveCour()
	{
		try {
			mockMvc.perform(post("/saveCour")
				.contentType(MediaType.APPLICATION_JSON)
				.content(Json.fromObject(new CoursCode(5, "Cours test", null))))
				.andExpect(status().isCreated());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
