package com.ques3;

import java.util.List;

public class BankAccountServiceImpl implements BankAccountService {
	List<BankAccount> accountInfo;
	public double withdraw(long accountId, double balance) {
		if(accountId==((BankAccount) accountInfo).getAccountId()) {
		if(balance<((BankAccount) accountInfo).getAccountBalance()) {
			double withdrawAmount= ((BankAccount) accountInfo).getAccountBalance()-balance;
			return withdrawAmount;
		}
		return ((BankAccount) accountInfo).getAccountBalance();
		}
			else {
				return 0;
			}
		
	}

	public double deposit(long accountId, double balance) {
		if(accountId==((BankAccount) accountInfo).getAccountId()) {
				double deposit= ((BankAccount) accountInfo).getAccountBalance()+balance;
				System.out.println("hey");
				return deposit;
			
				
		}
		System.out.println("hey");
		return 0;
	}

	public double getBalance(long accountId) {
		if(accountId==((BankAccount) accountInfo).getAccountId()) {
		return ((BankAccount) accountInfo).getAccountId();}
		else {return 0;}
	}

	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		if(amount<((BankAccount) accountInfo).getAccountId()) {
			return true;
		}
		else
		return false;
	}

}
