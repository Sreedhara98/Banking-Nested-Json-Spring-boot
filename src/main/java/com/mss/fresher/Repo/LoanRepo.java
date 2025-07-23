package com.mss.fresher.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mss.fresher.Entity.Loan;

public interface LoanRepo extends JpaRepository<Loan, String>{
	
	

}
