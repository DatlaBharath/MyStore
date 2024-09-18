package com.iiht.store.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Choclates")
public class Choclates {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long choclateId;
	
	private String comapny;
	private int cost;
	private String expiryDate;
	private String DateOfManufacture;	
}