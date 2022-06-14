package com.inti.Project_AutoEcole.Service;

import java.util.List;


import com.inti.Project_AutoEcole.Model.Role;

public interface RoleService 
{
	Role saveRole(Role role);
	List<Role> getAllRole();
	Role updateRole(Role role);
	Role getRole(int id);
	void deleteRole(int id);

}
