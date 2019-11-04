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

public class Servizi {

	public enum Servicetype {
		SEKOMA,
		CONFAGRICOLTURA
	}
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String name;

private int year;

private double price;

private Servicetype servicetype;


}
