package com.inti.Project_AutoEcole.Repository;

import com.inti.Project_AutoEcole.Model.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> 
{
	

}
