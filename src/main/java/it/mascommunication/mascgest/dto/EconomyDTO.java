package it.mascommunication.mascgest.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property ="id")
public class EconomyDTO {

	

	private Long id;

	private double price;
	private double iva;

	private double account;

	private double total;

	private double notIva;
	
	private ServiziDTO servizi;
	
	private CompanyDTO idc;
}
