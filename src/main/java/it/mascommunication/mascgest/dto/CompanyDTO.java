package it.mascommunication.mascgest.dto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import it.mascommunication.mascgest.model.Company.Companytype;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(scope = CompanyDTO.class, generator = ObjectIdGenerators.PropertyGenerator.class, property = "idc")

public class CompanyDTO {
	
	private Long idc;
	
	private String name;

	private String ssn;

	private int pi;

	private String country;

	private String address;

	private String phone;

	private String mobile;

	private String fax;

	private String legalform;

	private String mail;

	private String pec;

	private String members;
	
	private Companytype comp;

		// TODO Auto-generated method stub
		
	}


