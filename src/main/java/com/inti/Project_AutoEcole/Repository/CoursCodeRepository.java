package com.inti.Project_AutoEcole.Repository;

import com.inti.Project_AutoEcole.Model.CoursCode;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CoursCodeRepository extends JpaRepository<CoursCode, Integer>{

}
