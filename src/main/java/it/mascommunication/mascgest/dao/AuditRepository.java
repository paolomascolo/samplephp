package it.mascommunication.mascgest.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.mascommunication.mascgest.model.Audit;

@Repository
@Transactional
public interface AuditRepository extends CrudRepository<Audit,Long>{
	
Audit findById(long id);
	

}
