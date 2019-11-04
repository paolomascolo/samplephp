package it.mascommunication.mascgest.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "economy",uniqueConstraints = @UniqueConstraint(columnNames = {"servizi_id", "idc_idc"}) )
public class Economy  {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;

	@Column
	private double price;

	private double iva;

	private double account;

	private double total;

	private double notIva;
	@ManyToOne
	@JoinColumn()
	private Servizi servizi;

	@ManyToOne
	@JoinColumn()
	private Company idc;
	

}
