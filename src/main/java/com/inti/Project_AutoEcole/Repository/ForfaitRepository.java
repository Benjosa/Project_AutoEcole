package com.inti.Project_AutoEcole.Repository;

import com.inti.Project_AutoEcole.Model.Forfait;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForfaitRepository extends JpaRepository<Forfait, Integer>{

}
