package it.mascommunication.mascgest.service;

import org.springframework.beans.factory.annotation.Autowired;

import it.mascommunication.mascgest.converter.CompanyConverter;
import it.mascommunication.mascgest.dao.CompanyRepository;
import it.mascommunication.mascgest.dto.CompanyDTO;
import it.mascommunication.mascgest.model.Company;

import org.springframework.stereotype.Service;

@Service
public class CompanyService extends AbstractService<Company,CompanyDTO> {
	
	@Autowired
	CompanyRepository repos;
	@Autowired
	CompanyConverter conver;
	
	public CompanyDTO findById(long id) {
		return converter.toDTO(((CompanyRepository)repository).findById(id));
		
	}
	public Iterable<CompanyDTO> getTutto(){
		return conver.toDTOList(repos.findAll());
	}
}
