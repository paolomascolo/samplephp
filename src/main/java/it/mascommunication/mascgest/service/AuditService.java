package it.mascommunication.mascgest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.mascommunication.mascgest.converter.AuditConverter;
import it.mascommunication.mascgest.dao.AuditRepository;
import it.mascommunication.mascgest.dto.AuditDTO;
import it.mascommunication.mascgest.model.Audit;

@Service
public class AuditService extends AbstractService<Audit,AuditDTO> {
	
	@Autowired
	AuditRepository repos;
	@Autowired
	AuditConverter conver;
	
	public AuditDTO findById(long id) {
		return converter.toDTO(((AuditRepository)repository).findById(id));
	}
	public Iterable<AuditDTO> getTutto(){
		return conver.toDTOList(repos.findAll());	
		}
}
