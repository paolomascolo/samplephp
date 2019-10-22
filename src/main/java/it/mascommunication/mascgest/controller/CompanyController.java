package it.mascommunication.mascgest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.mascommunication.mascgest.dto.CompanyDTO;
import it.mascommunication.mascgest.service.CompanyService;

@RestController
@RequestMapping("/company")
@CrossOrigin(origins="*")
public class CompanyController {
	
	@Autowired
	CompanyService service;
	
	@GetMapping("all")
	public Iterable<CompanyDTO> list (){
		return service.getAll();
	}

}
