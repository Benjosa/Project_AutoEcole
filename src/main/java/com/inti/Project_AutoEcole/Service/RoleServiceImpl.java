package com.inti.Project_AutoEcole.Service;

import java.util.List;

import com.inti.Project_AutoEcole.Model.Role;
import com.inti.Project_AutoEcole.Repository.RoleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService 
{
	@Autowired
	RoleRepository roleRepository;

	@Override
	public Role saveRole(Role role) 
	{
		
		return roleRepository.save(role);
	}

	@Override
	public List<Role> getAllRole() 
	{
		
		return roleRepository.findAll();
	}

	@Override
	public Role updateRole(Role role) 
	{
		
		return roleRepository.save(role);
	}

	@Override
	public Role getRole(int id) 
	{
		
		return roleRepository.getReferenceById(id);
	}

	@Override
	public void deleteRole(int id) 
	{
		
		roleRepository.deleteById(id);
		
	}
	
	

}
