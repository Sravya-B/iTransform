package com.ques3;

import java.util.List;

import com.ques4.BankAccount;

public class BankAccountRepositoryImpl implements BankAccountRepository{
	BankAccount bankInfo=new BankAccount();
	public double getBalance(long accountId) {
		return bankInfo.getAccountBalance();
	}
	public double updateBalance(long accountId, double newBalance) {
		if(accountId==bankInfo.getAccountId()) {
			return newBalance;}
		else {
		return bankInfo.getAccountBalance();
		}
	}

}
