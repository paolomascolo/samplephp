package it.mascommunication.mascgest.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.mascommunication.mascgest.model.User;

@Repository
@Transactional
public interface UserRepository extends CrudRepository<User,Long>{
	
	User findByUsernameAndPassword(String username,String password);

}
