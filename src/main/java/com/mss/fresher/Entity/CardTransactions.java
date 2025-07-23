package com.mss.fresher.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "card_trans")
@Component
public class CardTransactions {

	@Id
	private String transactionId;
	
	private String currency;
	private String status;
	
	private LocalDateTime  transdate;
	
	private String merchant;
	
	
	private Double  amount;
	
	@ManyToOne
	@JoinColumn(name="card_id",referencedColumnName = "cardId")
	@JsonBackReference
	private Card card;
}
