package com.mss.fresher.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.mss.fresher.Entity.Card;
import com.mss.fresher.Entity.CardTransactions;
import com.mss.fresher.Entity.Customer;
import com.mss.fresher.Entity.Loan;
import com.mss.fresher.Repo.CardRepo;
import com.mss.fresher.Repo.CardTransactionRepo;
import com.mss.fresher.Repo.CustomerRepo;
import com.mss.fresher.Repo.LoanRepo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Service
public class PaymentService {
	@Autowired
	CardRepo  cardRepo;
	
	@Autowired
	CardTransactionRepo cardTransactionRepo;
	
	@Autowired
	CardTransactions cardTransactions;
	
	@Autowired
	LoanRepo loanRepo;
	@Autowired
	CustomerRepo customerRepo;
	
	public Customer pay(String cardNumber,Double amount,String custId,String Merchant,String LoanId) {
		
		Card card = cardRepo.findByCardNumber(cardNumber);
		
		
		card.setAvailableLimit(card.getAvailableLimit()-amount);
		
		cardRepo.save(card);
		cardTransactions.setAmount(amount);
		cardTransactions.setMerchant(Merchant);
		
		cardTransactions.setCard(card);
		cardTransactions.setMerchant("amazon");
		cardTransactions.setTransdate(LocalDateTime.now());
		cardTransactions.setCurrency("INR");
		cardTransactions.setTransactionId(Merchant);
		
	cardTransactions.setTransactionId(UUID.randomUUID().toString());	
	
	cardTransactionRepo.save(cardTransactions);
	
	Loan loan = loanRepo.findById(LoanId).get();
	
	loan.setNextDueDate(loan.getNextDueDate().plusMonths(1));
	
	loanRepo.save(loan);
	
	
	Customer customer = customerRepo.findById(custId).get();
	
	
	
	List<CardTransactions> c=new  ArrayList<>();
	c.add(cardTransactions);
	
	
	
	
	List<Card> cards=new ArrayList<>();
	
	cards.add(card);
	
	card.setTransactions(c);
	
	customer.setCards(cards);
	return customer;
	
	}
	

	public Customer  seeTrans(String cust_id) {
		return customerRepo.findById(cust_id).get();
	}

}
