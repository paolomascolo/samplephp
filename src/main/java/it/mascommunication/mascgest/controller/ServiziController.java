package it.mascommunication.mascgest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.mascommunication.mascgest.dto.ServiziDTO;
import it.mascommunication.mascgest.dto.UserDTO;
import it.mascommunication.mascgest.service.ServiziService;

@RestController
@RequestMapping("/servizi")
@CrossOrigin(origins="*")
public class ServiziController extends AbstractController<ServiziDTO>{
	
	@Autowired
	ServiziService servizi;
	
	@GetMapping("all")
	public Iterable<ServiziDTO> list (){
		return servizi.getAll();
	}
	
	

}
