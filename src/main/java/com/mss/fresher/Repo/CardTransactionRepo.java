package com.mss.fresher.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mss.fresher.Entity.CardTransactions;

public interface CardTransactionRepo extends JpaRepository<CardTransactions, String>{

}
