package com.inti.Project_AutoEcole.Controller;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.sql.Date;

import com.inti.Project_AutoEcole.Json;
import com.inti.Project_AutoEcole.Controller.ClientController;
import com.inti.Project_AutoEcole.Model.Client;
import com.inti.Project_AutoEcole.Service.ClientService;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(controllers = ClientController.class)
public class ClientControllerTests {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private ClientService clientService;
	
	@Test
	public void testAffichageClients()
	{
		try {
			mockMvc.perform(get("/clients"))
				.andExpect(status().isOk());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSaveClient()
	{
		try {
			mockMvc.perform(post("/saveClient")
				.contentType(MediaType.APPLICATION_JSON)
				.content(Json.fromObject(new Client("toto", "titi", Date.valueOf("2020-01-01"),"toto@toto", "rue des toto"))))
				.andExpect(status().isCreated());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
