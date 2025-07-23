package com.mss.fresher.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "sharath_bank_user_address")
@Data
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;
private String street;

private String city;

private String state;

private String postalCode;

private String country;

@OneToOne
@JoinColumn(name = "cust_id",referencedColumnName = "customerId")
@JsonBackReference
private Customer customer;


}
