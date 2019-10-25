package com.ques4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service ("bankAccountService")
public class BankAccountServiceImpl implements BankAccountService {
@Autowired
BankAccount bankAccount;
double amount=bankAccount.getAccountBalance();
long id=bankAccount.getAccountId();
	public double withdraw(long accountId, double balance) {
		if(accountId==id) {
			amount=amount-balance;
			return amount;
		}
		else {
			return amount;
		}
	}

	public double deposit(long accountId, double balance) {
		if(accountId==id) {
			amount=amount+balance;
			return amount;
		}
		else {
			return amount;
			}
	}

	public double getBalance(long accountId) {
		if(accountId==id) {
		return amount;
		}
		else {
			return 0;
		}
	}

	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		if(amount<this.amount) {
		return true;}
		else {
			return false;
		}
	}

	

}
