package it.mascommunication.mascgest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Audit {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

private String status;

@ManyToOne
private User user;
	
}

