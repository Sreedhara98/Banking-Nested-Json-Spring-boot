package com.mss.fresher.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mss.fresher.Dto.PaymentDto;
import com.mss.fresher.Entity.Customer;
import com.mss.fresher.Service.PaymentService;
@RestController
@RequestMapping("/pay")
public class PaymentController {
	@Autowired
	PaymentService  paymentService;
	
	@PostMapping("/payment")
	public Customer pay(@RequestBody PaymentDto request) {
		
		
		Customer pay = paymentService.pay(request.getCardNumber(), request.getAmount(), request.getCustId(), request.getMerchant(),request.getLoanId());
		
		
		return pay;
		
	}
	
	@GetMapping("/get/{id}")
	public Customer seeUsers(@PathVariable String  id) {
		
		System.out.println(id);
		return paymentService.seeTrans(id);
	}

}
