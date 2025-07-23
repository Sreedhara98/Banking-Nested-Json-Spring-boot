package com.mss.fresher.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "s_trans")
public class Transaction {
	
	@Id
	private String transactionId;
	
	private LocalDateTime transdate;
	
	
	private String type;
	
	
	private double amount;
	
	private String description;
	
	private String status;
	
	@ManyToOne
	@JoinColumn(name = "acct_number",referencedColumnName = "accountId")
	@JsonBackReference
	private Account account;
	
	
	
	
	
	
	
	

}
