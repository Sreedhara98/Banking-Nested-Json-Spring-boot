package com.mss.fresher.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Table(name = "s_Preference")
@Data
public class Preference {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Boolean smsAlerts;
	
	private Boolean emailAlerts;
	
	private String preferredLanguage;
	
	@OneToOne
	@JoinColumn(name = "cust_id",referencedColumnName = "customerId")
	@JsonBackReference
	private Customer customer;

}
