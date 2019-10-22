package it.mascommunication.mascgest.service;

import org.springframework.stereotype.Service;

import it.mascommunication.mascgest.dao.UserRepository;
import it.mascommunication.mascgest.dto.UserDTO;
import it.mascommunication.mascgest.model.User;

@Service
public class UserService extends AbstractService<User,UserDTO>{

	public UserDTO fidByUsernameAndPassword(String username,String password) {
		return converter.toDTO(((UserRepository)repository).findByUsernameAndPassword(username,password));
	}
	
}
