package it.mascommunication.mascgest.converter;

import org.springframework.stereotype.Component;

import it.mascommunication.mascgest.dto.CompanyDTO;
import it.mascommunication.mascgest.model.Company;

@Component
public class CompanyConverter extends AbstractConverter<Company, CompanyDTO> {

	@Override
	public Company toEntity(CompanyDTO companyDTO) {
		Company company = null;
		if(companyDTO != null) {
			company = new Company();
			company.setId(companyDTO.getId());
		}
		return company;
	}

	@Override
	public CompanyDTO toDTO(Company company) {
		CompanyDTO companyDTO = null;
		if (company != null) {
			companyDTO = new CompanyDTO();
			companyDTO.setId(company.getId());
		}
		return companyDTO;
	}
}
