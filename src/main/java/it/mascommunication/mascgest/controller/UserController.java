package it.mascommunication.mascgest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.mascommunication.mascgest.dto.LoginDTO;
import it.mascommunication.mascgest.dto.UserDTO;
import it.mascommunication.mascgest.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserController extends AbstractController<UserDTO> {
	
	@Autowired
	private UserService userService;
	
	@PostMapping(value = "/login")
	public UserDTO login(@RequestBody LoginDTO loginDTO) {
		return userService.fidByUsernameAndPassword(loginDTO.getUsername(),loginDTO.getPassword());
	}
	


}
