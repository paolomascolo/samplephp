package it.mascommunication.mascgest.service;

import org.springframework.beans.factory.annotation.Autowired;

import it.mascommunication.mascgest.converter.EconomyConverter;
import it.mascommunication.mascgest.dao.EconomyRepository;
import it.mascommunication.mascgest.dto.EconomyDTO;
import it.mascommunication.mascgest.model.Economy;
import org.springframework.stereotype.Service;

@Service
public class EconomyService extends AbstractService<Economy,EconomyDTO>{

	@Autowired
	EconomyRepository repos;
	@Autowired
	EconomyConverter conv;
	
	public EconomyDTO findById(long id) {
		return converter.toDTO(((EconomyRepository)repository).findById(id));
	}
	
	public Iterable<EconomyDTO> getTutto(){
		return conv.toDTOList(repos.findAll());
	}
	
}
