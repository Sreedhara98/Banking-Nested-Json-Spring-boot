package com.mss.fresher.Entity;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "s_cust")
public class Customer {
	
	@Id
	
	private String customerId;
	
	private String firstName;
	
	private  String lastName;
	
	private String email;
	
@OneToOne(mappedBy = "customer",cascade = CascadeType.ALL)
@JsonManagedReference

	private Address address;
	
	@OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Account> accounts;
	
	@OneToMany(mappedBy = "customer" ,cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Loan> loans;
	
	@OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Card> cards;
	
	@OneToOne(mappedBy = "customer" ,cascade = CascadeType.ALL)
	@JsonManagedReference
	private Preference preferences;
	
	
	private String kycStatus;
	
	private String riskProfile;
	

}
