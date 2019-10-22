package it.mascommunication.mascgest.dao;

import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import it.mascommunication.mascgest.model.Company;

@Repository
@Transactional
public interface CompanyRepository extends CrudRepository<Company,Long> {

	Company findById(long id);
}
