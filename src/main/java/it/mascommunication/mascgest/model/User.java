package it.mascommunication.mascgest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
	
	public enum Usertype {
		ADMIN,
		OPER
	}
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

@Column(unique = true)
private String username;

private String password;

private Usertype usertype;


}