package com.raphael.votacoop.resources.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raphael.votacoop.domain.Voto;

@Repository
public interface VotoRepository extends JpaRepository<Voto, Integer>{

	//List<Voto> findByid_sessaoAndid_usuario(Integer idSessaoVotacao, Integer idUsuario);
	
	
}
