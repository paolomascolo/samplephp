package it.mascommunication.mascgest.service;

import org.springframework.beans.factory.annotation.Autowired;
import it.mascommunication.mascgest.converter.ServiziConverter;
import it.mascommunication.mascgest.dao.ServiziRepository;
import it.mascommunication.mascgest.dto.ServiziDTO;
import it.mascommunication.mascgest.model.Servizi;
import org.springframework.stereotype.Service;

@Service
public class ServiziService extends AbstractService<Servizi,ServiziDTO> {
	
	@Autowired
	ServiziRepository repos;
	@Autowired
	ServiziConverter conver;
	
	public ServiziDTO findById(long id) {
		return converter.toDTO(((ServiziRepository)repository).findById(id));
		
	}
	public Iterable<ServiziDTO> getTutto(){
		return conver.toDTOList(repos.findAll());
	}
}
