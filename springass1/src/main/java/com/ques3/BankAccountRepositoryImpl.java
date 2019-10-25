package com.ques3;

import java.util.List;

public class BankAccountRepositoryImpl implements BankAccountRepository{
List<BankAccount> accountInfo;
	public double getBalance(long accountId) {
		if(accountId==((BankAccount) accountInfo).getAccountId()) {
		return ((BankAccount) accountInfo).getAccountBalance();
	}
		else {
			return 0;
		}
	}

	public double updateBalance(long accountId, double newBalance) {
		if(accountId==((BankAccount) accountInfo).getAccountId()) {
			double balance= ((BankAccount) accountInfo).getAccountBalance()+newBalance;
			return balance;
		}
			else {
				return 0;
			}
		
	}

}
