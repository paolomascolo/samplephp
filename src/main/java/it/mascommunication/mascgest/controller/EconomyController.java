package it.mascommunication.mascgest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.mascommunication.mascgest.dto.EconomyDTO;
import it.mascommunication.mascgest.service.EconomyService;

@RestController
@RequestMapping("/economy")
@CrossOrigin(origins ="*")

public class EconomyController extends AbstractController<EconomyDTO>{
	
	@Autowired
	EconomyService service;
	
	@GetMapping("all")
	public Iterable<EconomyDTO> list(){
		return service.getAll();
		
	}
	
	
	
	
	

}
