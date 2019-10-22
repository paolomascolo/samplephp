package it.mascommunication.mascgest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.mascommunication.mascgest.dto.AuditDTO;
import it.mascommunication.mascgest.service.AuditService;

@RestController
@RequestMapping("/audit")
@CrossOrigin(origins= "*")
public class AuditController extends AbstractController<AuditDTO> {
	
	@Autowired
	AuditService service;
	
	@GetMapping("all")
	public Iterable<AuditDTO> list (){
		return service.getAll();
	}

}
