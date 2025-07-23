package com.mss.fresher.Entity;

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
@Table(name = "sharath_cards")
public class Card {
	@Id
	private String cardId;
	private String cardType;
	
	private String cardNumber;
	private String status;
	private Double limit;
	
	private Double availableLimit;
	@OneToMany(mappedBy = "card",cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<CardTransactions> transactions;
	@ManyToOne
	@JoinColumn(name = "cust_id",referencedColumnName = "customerId")
	@JsonBackReference
	private Customer customer;
	
}
