package it.mascommunication.mascgest.dto;

import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuditDTO {
	
	private long id;
	
	private String status;
	
	@ManyToOne
	private UserDTO userDTO;

}
