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


@Entity
@Table(name = "sharath_loan")
@Data
public class Loan {
	@Id
	private String loanId;
	
	private String  loanType;
	
	
	private Double  principalAmount;
	
	private Double outstandingAmount;
	
	private Double interestRate;
	
	
	private Double tenureMonths;
	
	private Double emi;
	
	private LocalDateTime nextDueDate;
	
	 private String status;
	 
	 @ManyToOne
	 @JoinColumn(name = "cust_id",referencedColumnName = "customerId")
	 @JsonBackReference
	 private Customer customer;
	 
	 
	

}
