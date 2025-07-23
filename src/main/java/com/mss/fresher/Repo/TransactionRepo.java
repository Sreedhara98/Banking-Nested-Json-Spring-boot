package com.mss.fresher.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mss.fresher.Entity.Transaction;

public interface TransactionRepo extends JpaRepository<Transaction, String>{

}
