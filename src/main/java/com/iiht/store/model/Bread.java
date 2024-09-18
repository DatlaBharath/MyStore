package com.iiht.store.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.GenerationType;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Bread")
public class Bread {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long breadId;
	private String company;
	private int quantity;
	private String selfLife;
	private String arrivalDate;
}