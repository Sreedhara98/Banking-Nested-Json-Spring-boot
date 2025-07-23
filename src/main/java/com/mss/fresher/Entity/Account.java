package com.mss.fresher.Entity;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "s_account")
public class Account {
	@Id
	private String accountId;
	
	private String accountType;
	private String currency;
	
	private Double balance;

	private String status;
	
	
	private LocalDate openedDate;
	
	@OneToMany(mappedBy = "account",cascade = CascadeType.ALL)
	@JsonManagedReference
	
	private List<Transaction>  transactions;
	
	@ManyToOne
	@JoinColumn(name="cust_id",referencedColumnName = "customerId")
	@JsonBackReference
	private Customer customer;
	
	

}
