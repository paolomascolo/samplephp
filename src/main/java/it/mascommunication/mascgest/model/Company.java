package it.mascommunication.mascgest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Company {

	public enum Companytype {
		SEKOMA,
		CONFAGRICOLTURA
	}
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
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


}

