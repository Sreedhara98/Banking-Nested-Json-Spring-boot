package com.mss.fresher.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mss.fresher.Entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, String>{

}
