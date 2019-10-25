package com.ques3;

import org.springframework.stereotype.Controller;

@Controller("bankController")
public class BankAccountController {
	double accountBalance;
	long accountId;
	public double withdraw(long accountId, double balance) {
		if(accountId==this.accountId) {
			accountBalance-=balance;
		return accountBalance;}
		else {
			return 0;
		}
		
	}
	public double deposit(long accountId, double balance) {
		if(accountId==this.accountId) {
			accountBalance+=balance;
		return accountBalance;}
		else {return 0;}
		
	}
	public double getBalance(long accountId) {
		if(accountId==this.accountId) {
		return accountBalance;}
		else {
			return 0;
		}
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public double setAccountBalance(double accountBalance) {
		return this.accountBalance = accountBalance;
	}
	public long getAccountId() {
		return accountId;
	}
	public double setAccountId(long accountId) {
		return this.accountId = accountId;
	}
	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		if(accountBalance>amount) {
			return true;
		}
		else
		{
			return false;
		}
	}

}
