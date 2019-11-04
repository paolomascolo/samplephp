package it.mascommunication.mascgest.converter;

import org.springframework.stereotype.Component;

import it.mascommunication.mascgest.dto.CompanyDTO;
import it.mascommunication.mascgest.model.Company;

@Component
public class CompanyConverter extends AbstractConverter<Company, CompanyDTO> {

	@Override
	public Company toEntity(CompanyDTO companyDTO) {
		Company company = null;
		if (companyDTO != null) {
			company = new Company();
			company.setIdc(companyDTO.getIdc());

			company.setName(companyDTO.getName());
			company.setSsn(companyDTO.getSsn());
			company.setPi(companyDTO.getPi());
			company.setCountry(companyDTO.getCountry());
			company.setAddress(companyDTO.getAddress());
			company.setPhone(companyDTO.getPhone());
			company.setMobile(companyDTO.getMobile());
			company.setFax(companyDTO.getFax());
			company.setLegalform(companyDTO.getLegalform());
			company.setMail(companyDTO.getMail());
			company.setPec(companyDTO.getPec());
			 company.setMembers(companyDTO.getMembers());
			company.setComp(companyDTO.getComp());


		}
		return company;
	}

	@Override
	public CompanyDTO toDTO(Company company) {
		CompanyDTO companyDTO = null;
		if (company != null) {
			companyDTO = new CompanyDTO();
			companyDTO.setIdc(company.getIdc());
			companyDTO.setName(company.getName());
			companyDTO.setSsn(company.getSsn());
			companyDTO.setPi(company.getPi());
			companyDTO.setCountry(company.getCountry());
			companyDTO.setAddress(company.getAddress());
			companyDTO.setPhone(company.getPhone());
			companyDTO.setMobile(company.getMobile());
			companyDTO.setFax(company.getFax());
			companyDTO.setLegalform(company.getLegalform());
			companyDTO.setMail(company.getMail());
			companyDTO.setPec(company.getPec());
			 companyDTO.setMembers(company.getMembers());
			companyDTO.setComp(company.getComp());

		}
		return companyDTO;
	}
}
