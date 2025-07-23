package com.mss.fresher.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mss.fresher.Entity.Card;

public interface CardRepo extends JpaRepository<Card, String>{
	@Query("select c from Card c where c.cardNumber=:cardNum")
	public Card  findByCardNumber(@Param("cardNum") String  cardNum);

}
