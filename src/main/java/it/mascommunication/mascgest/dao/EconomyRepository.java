package it.mascommunication.mascgest.dao;


import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.mascommunication.mascgest.model.Economy;

@Repository
@Transactional
public interface EconomyRepository extends CrudRepository<Economy,Long>{

	Economy findById(long id);
}
