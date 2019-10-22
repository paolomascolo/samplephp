package it.mascommunication.mascgest.dto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import it.mascommunication.mascgest.model.Servizi.Servicetype;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property ="id")

public class CompanyDTO {
	public enum Servicetype {
		SEKOMA,
		CONFAGRICOLUTA
	}
	private long id;

	private String type;

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

}
