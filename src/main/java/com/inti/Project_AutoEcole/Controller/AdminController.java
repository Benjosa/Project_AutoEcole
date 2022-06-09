package com.inti.Project_AutoEcole.Controller;

import com.inti.Project_AutoEcole.Service.ClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController 
{
	@Autowired
	ClientService adminService;
	
	

}
