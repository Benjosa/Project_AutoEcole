package com.inti.Project_AutoEcole.Controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.inti.Project_AutoEcole.Service.VehiculeService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(controllers = VehiculeController.class)
public class VehiculeControllerTests {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private VehiculeService vehiculeService;
	
	@Test
	public void testGetVehicules()
	{
		try {
			mockMvc.perform(get("/vehicule"))
				.andExpect(status().isOk());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
