package com.mss.fresher.Dto;

import lombok.Data;

@Data
public class PaymentDto {
	
	private String method;
	
	private String cardNumber;
	
	private String loanId;
	
	private Double amount;
	
	private String custId;


	  private String Merchant;
	

}
