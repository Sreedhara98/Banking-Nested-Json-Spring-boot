package com.mss.fresher.Aspect;


import java.time.LocalDateTime;

import javax.management.RuntimeErrorException;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class BeforeAscpect {
	
	@Before("execution(* com.mss.fresher.Controller.*.*(..))")
	
	public void logBefore(JoinPoint joinpoint) {
		
System.out.println(joinpoint.getSignature());
		
//        throw new RuntimeException("Intentional failure!");

		
	}
	
	@After("execution(* com.mss.fresher.Controller.*.*(..))")
	public void lofAfer(JoinPoint joinPoint) {
		System.out.println("After my method exceutions");
		
		
		
	}
	
//	 @Around("execution(* com.mss.fresher.Controller.*.*(..))")
//	    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
//		 
//	        long startTime = System.currentTimeMillis();
//
//	        System.out.println("Method START: " + joinPoint.getSignature());
//             
//	        Object result = joinPoint.proceed(); 	
//	        long endTime = System.currentTimeMillis();
//
//	        System.out.println("Method END: " + joinPoint.getSignature());
//	        System.out.println("Execution Time: " + (endTime - startTime) + "ms");
//
//	        return result;
//	    }
	
	@AfterReturning(
		    pointcut = "execution(* com.mss.fresher.Controller.*.*(..))",
		    returning = "result")
		public void logAfterReturning(Object result) {
		    System.out.println("After Returning - Method returned: ");
		}

}
