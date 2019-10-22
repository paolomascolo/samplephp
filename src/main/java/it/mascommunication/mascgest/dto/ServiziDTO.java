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

public class ServiziDTO {
	
	private long id;
	
	private String name;
	
	private int year;
	
	private double price;
	
	private Servicetype servicetype;

}
