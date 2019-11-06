package com.sravya.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class BankAspect {
	@Before("execution(* com.sravya.springAOP.BankAccountServiceImpl.withdraw(..))")
	public void beforeCustomer(JoinPoint joinPoint) {
		System.out.println("@Before is running");
		System.out.println("@Before the method: "+joinPoint.getSignature().getName());
	}
	/*@After("execution(* com.sravya.springAOP02.Customer.customer(..))")
	public void afterCustomer() {
		System.out.println("@After is running");
	}
	@AfterReturning(
			pointcut="execution(* com.sravya.springAOP02.Customer.customerReturn(..))",
			returning="result")
	public void afterReturningCustomer(Object result) {
		System.out.println("@AfterReturning is running");
		System.out.println("method returned value is "+result);
	}
	@AfterThrowing(
			pointcut="execution(* com.sravya.springAOP02.Customer.customerException(..))",
			throwing="error")
	public void afterThrowingException(Throwable error) {
		System.out.println("@AfterThrowing exception is running");
	    System.out.println("Exception is "+error);
	}
	@Around("execution(* com.sravya.springAOP02.Customer.customerAround(..))")
	public void aroundCustomer(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("@Around is running");
		System.out.println("Before and after the method: "+joinPoint.getSignature().getName());
		System.out.println("Around before is running");
		joinPoint.proceed();
		System.out.println("Around after is running");
	}*/
}
