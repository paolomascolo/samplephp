package it.mascommunication.mascgest.dao;

import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import it.mascommunication.mascgest.model.Servizi;

@Repository
@Transactional
public interface ServiziRepository extends CrudRepository<Servizi,Long> {

	Servizi findById(long id);
}
